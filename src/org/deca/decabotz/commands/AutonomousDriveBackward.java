/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.deca.decabotz.commands;

import org.deca.decabotz.RobotMap;

/**
 *
 * @author Sciencelab
 */
public class AutonomousDriveBackward extends CommandBase {
    
    public AutonomousDriveBackward() {
        requires(driveTrain);
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
        driveTrain.timedDrive(RobotMap.autonomousDriveBackwardSpeed, RobotMap.autonomousDriveBackwardTurn, RobotMap.autonomousDriveBackwardTime);
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
