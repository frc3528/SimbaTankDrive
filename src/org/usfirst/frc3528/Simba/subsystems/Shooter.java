package org.usfirst.frc3528.Simba.subsystems;

import org.usfirst.frc3528.Simba.RobotMap;

import com.ctre.CANTalon;

import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class Shooter extends Subsystem {

    // Put methods for controlling this subsystem
    // here. Call these from Commands.
	
	 CANTalon shooterMotor = RobotMap.shooterMotor;

    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
    
    public void runShooter(double speed) {
    	shooterMotor.set(speed);
    }
}

