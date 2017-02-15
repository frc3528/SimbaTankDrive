package org.usfirst.frc3528.Simba.commands;

import org.usfirst.frc3528.Simba.Robot;
import org.usfirst.frc3528.Simba.RobotMap;
import org.usfirst.frc3528.Simba.subsystems.Shooter;

import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

/**
 *
 */
public class RunShooter extends Command {
	
	double speed = 0;
	double timeout = 30;
	Shooter shooter = Robot.shooter;

    public RunShooter() {
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
    	
    	requires(shooter);
    	
    	SmartDashboard.putNumber("speed", 0);
    	SmartDashboard.putNumber("timeout", 30);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    	
    	SmartDashboard.getNumber("timeout", 30);    	
    	this.setTimeout(timeout);    
    }
    
    

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	
    	speed = SmartDashboard.getNumber("speed", 0);
    	shooter.runShooter(speed);

    	SmartDashboard.putNumber("Rate", RobotMap.shooterMotor.getSpeed());
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return this.isTimedOut();
    }

    // Called once after isFinished returns true
    protected void end() {
    	
    	shooter.runShooter(0);
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    	
    	shooter.runShooter(0);
    }
    
}
