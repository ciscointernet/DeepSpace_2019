/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/
//Thanks Greg!!

package frc.robot.commands;

import edu.wpi.first.wpilibj.command.Command;

public class TimerDelay extends Command {
  double time_delta;
  public TimerDelay(double time_delta) {
    // Use requires() here to declare subsystem dependencies
    // eg. requires(chassis);
    this.time_delta = time_delta;
  }
  
// Called just before this Command runs the first time
  @Override
  protected void initialize() {
    setTimeout(time_delta);
  }

  // Called repeatedly when this Command is scheduled to run
  @Override
  protected void execute() {
  }

  // Make this return true when this Command no longer needs to run execute()
  @Override
  protected boolean isFinished() {
    return isTimedOut();
  }

  // Called once after isFinished returns true
  @Override
  protected void end() {
  }

  // Called when another command which requires one or more of the same
  // subsystems is scheduled to run
  @Override
  protected void interrupted() {
  }
}
