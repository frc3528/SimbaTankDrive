package org.usfirst.frc3528.Simba;

import org.usfirst.frc3528.Simba.commands.*;
import org.usfirst.frc3528.Simba.RobotMap;
import org.usfirst.frc3528.Simba.commands.ToggleDriveMode;

import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import edu.wpi.first.wpilibj.*;
import edu.wpi.first.wpilibj.buttons.*;


/**
 * This class is the glue that binds the controls on the physical operator
 * interface to the commands and command groups that allow control of the robot.
 */
public class OI {
    //// CREATING BUTTONS
    // One type of button is a joystick button which is any button on a joystick.
    // You create one by telling it which joystick it's on and which button
    // number it is.
    // Joystick stick = new Joystick(port);
    // Button button = new JoystickButton(stick, buttonNumber);
    
    // There are a few additional built in buttons you can use. Additionally,
    // by subclassing Button you can create custom triggers and bind those to
    // commands the same as any other Button.
    
    //// TRIGGERING COMMANDS WITH BUTTONS
    // Once you have a button, it's trivial to bind it to a button in one of
    // three ways:
    
    // Start the command when the button is pressed and let it run the command
    // until it is finished as determined by it's isFinished method.
    // button.whenPressed(new ExampleCommand());
    
    // Run the command while the button is being held down and interrupt it once
    // the button is released.
    // button.whileHeld(new ExampleCommand());
    
    // Start the command when the button is released  and let it run the command
    // until it is finished as determined by it's isFinished method.
    // button.whenReleased(new ExampleCommand());

    
    public JoystickButton fButton;
    public JoystickButton rButton;
    public JoystickButton driveModeToggleButton;
    public Joystick driveStick;


    public OI() {

        driveStick = new Joystick(0);
        
        rButton = new JoystickButton(driveStick, 8);
        rButton.whenPressed(new ReverseSwitch());
        fButton = new JoystickButton(driveStick, 7);
        fButton.whenPressed(new ForwardSwitch());

	    
        // SmartDashboard Buttons
//        SmartDashboard.putData("Autonomous Command", new AutonomousCommand());
//        SmartDashboard.putData("DriveWithJoystick", new DriveWithJoystick());
//        SmartDashboard.putData("ForwardSwitch", new ForwardSwitch());
//        SmartDashboard.putData("ReverseSwitch", new ReverseSwitch());        
        SmartDashboard.putData("Run shooter", new RunShooter());
        
        driveModeToggleButton = new JoystickButton(driveStick, RobotMap.Y);
        driveModeToggleButton.whenPressed(new ToggleDriveMode());


    }
    

    public Joystick getdriveStick() {
        return driveStick;
    }

}

