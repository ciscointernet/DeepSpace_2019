/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot;

/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */

 
 // Our robot's may have different wiring (motorcontrollers/victors are hooked up
 //differently). Do not change the code, change the wiring between motorcontrollers.
 

public class RobotMap {

public static final int rightDriveFront = 2;
public static final int rightDriveBack = 3;

public static final int leftDriveFront = 0;
public static final int leftDriveBack = 1;

public static final int BALL_INTAKE_MOTOR = 4;

public static final int HATCH_INTAKE_MOTOR =5;
}
