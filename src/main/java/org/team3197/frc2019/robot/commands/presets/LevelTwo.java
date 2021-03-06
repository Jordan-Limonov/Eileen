package org.team3197.frc2019.robot.commands.presets;

import org.team3197.frc2019.robot.RobotMap.ElbowPreset;
import org.team3197.frc2019.robot.RobotMap.ElevatorPreset;
import org.team3197.frc2019.robot.commands.ExtendToPreset;
import org.team3197.frc2019.robot.commands.ElevateToPreset;
import org.team3197.frc2019.robot.subsystems.Elbow;
import org.team3197.frc2019.robot.subsystems.Elevator;

import edu.wpi.first.wpilibj.buttons.Trigger;
import edu.wpi.first.wpilibj.command.CommandGroup;

public class LevelTwo extends CommandGroup {

  public LevelTwo(Elevator elevator, Elbow arm, Trigger toggle) {

    addParallel(new ExtendToPreset(ElbowPreset.kHatchTwo, ElbowPreset.kCargoTwo, toggle, arm));
    addParallel(new ElevateToPreset(ElevatorPreset.kHatchLevelTwo, ElevatorPreset.kCargoLevelTwo, toggle, elevator));
  }
}
