/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.deca.decabotz.commands;

import edu.wpi.first.wpilibj.Timer;
import org.deca.decabotz.RobotMap;

/**
 *
 * @author Sciencelab
 */
public class ToggleFrisbeePush extends CommandBase {
    
    public ToggleFrisbeePush() {
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
        requires(frisbeePush);
    }

    // Called just before this Command runs the first time
    protected void initialize() {

    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
        frisbeePush.startFrisbeePush();

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
