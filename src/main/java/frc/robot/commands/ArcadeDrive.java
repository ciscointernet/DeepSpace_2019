/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.commands;

import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.buttons.Button;
import edu.wpi.first.wpilibj.GyroBase;
import edu.wpi.first.wpilibj.interfaces.Gyro;
import frc.robot.Robot;
import frc.robot.subsystems.GyroFix;

public class ArcadeDrive extends Command {
  public ArcadeDrive() {
    requires(Robot.drivetrain);
  }

  
  public static float POWER_PERCENT = 0.7f;

  // Called just before this Command runs the first time
  @Override
  protected void initialize() {
  }

  // Called repeatedly when this Command is scheduled to run
  @Override
  protected void execute() {
    double pedal = Robot.m_oi.getDriveLeftY();             
    double steer = -Robot.m_oi.getDriveRightX();
    boolean pedalPush = Robot.m_oi.getDriveLeftAnalogButton();
    boolean steerPush = Robot.m_oi.getDriveRightAnalogButton(); 
    //double ERROR = -gyroAngle;
    //double turnPower = POWER_PERCENT*ERROR;

    if (pedalPush) {
      POWER_PERCENT = 1f; // set drive power to full
    }
    else if (steerPush) {
      POWER_PERCENT = 0.7f; // set back to .7
    }


    Robot.drivetrain.runLeftDrive(-POWER_PERCENT*(pedal + steer ));
    Robot.drivetrain.runRightDrive(POWER_PERCENT*(-pedal + steer));
    




  }

  // Make this return true when this Command no longer needs to run execute()
  @Override
  protected boolean isFinished() {
    return false;
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
