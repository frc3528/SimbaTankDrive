package org.usfirst.frc3528.Simba.commands;

import org.usfirst.frc3528.Simba.Robot;
import org.usfirst.frc3528.Simba.subsystems.DriveTrain;

import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class PushBot extends Command {
	
	DriveTrain dt = Robot.driveTrain;

    public PushBot() {
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
    	
    	requires(dt);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	
    	dt.printAccelToDashboard();
    	
    	double yVal = dt.getAccelYVal();
    	
    	
    	if ( !dt.checkDMCValue() ) {
    		if (yVal > 0.2) {
        		System.out.println("This is where you'd run the Drive Forward Command.");
        		dt.toggleDMCValue();
        	}
    	} else if (yVal < 0.05) {
    			System.out.println("This is the end of the Drive Forward Command.");
    			dt.toggleDMCValue();
    	}
    	
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return false;
    }

    // Called once after isFinished returns true
    protected void end() {
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    }
}
