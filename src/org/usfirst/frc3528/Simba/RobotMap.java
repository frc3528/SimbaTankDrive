// RobotBuilder Version: 1.5
//
// This file was generated by RobotBuilder. It contains sections of
// code that are automatically generated and assigned by robotbuilder.
// These sections will be updated in the future when you export to
// Java from RobotBuilder. Do not put any code or make any change in
// the blocks indicating autogenerated code or it will be lost on an
// update. Deleting the comments indicating the section will prevent
// it from being updated in the future.


package org.usfirst.frc3528.Simba;
    
import edu.wpi.first.wpilibj.*;

import edu.wpi.first.wpilibj.livewindow.LiveWindow;
import java.util.Vector;

/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap {
    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS
    public static SpeedController driveTrainfrontLeftMotor;
    public static SpeedController driveTrainfrontRightMotor;
    public static SpeedController driveTrainrearLeftMotor;
    public static SpeedController driveTrainrearRightMotor;
    public static RobotDrive driveTraintankDrive;
    public static Compressor driveTrainCompressor;
    public static DoubleSolenoid driveTrainShifter;

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS

    public static void init() {
        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTORS
        driveTrainfrontLeftMotor = new Talon(1);
        LiveWindow.addActuator("DriveTrain", "frontLeftMotor", (Talon) driveTrainfrontLeftMotor);
        
        driveTrainfrontRightMotor = new Talon(0);
        LiveWindow.addActuator("DriveTrain", "frontRightMotor", (Talon) driveTrainfrontRightMotor);
        
        driveTrainrearLeftMotor = new Talon(3);
        LiveWindow.addActuator("DriveTrain", "rearLeftMotor", (Talon) driveTrainrearLeftMotor);
        
        driveTrainrearRightMotor = new Talon(2);
        LiveWindow.addActuator("DriveTrain", "rearRightMotor", (Talon) driveTrainrearRightMotor);
        
        driveTraintankDrive = new RobotDrive(driveTrainfrontLeftMotor, driveTrainrearLeftMotor,
              driveTrainfrontRightMotor, driveTrainrearRightMotor);
        
        driveTraintankDrive.setSafetyEnabled(true);
        driveTraintankDrive.setExpiration(0.1);
        driveTraintankDrive.setSensitivity(0.5);
        driveTraintankDrive.setMaxOutput(1.0);

        driveTrainCompressor = new Compressor(1);
        
        
        driveTrainShifter = new DoubleSolenoid(1, 1, 2);      
        LiveWindow.addActuator("GearShifter", "driveTrainShifter", driveTrainShifter);
        

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTORS
    }
}