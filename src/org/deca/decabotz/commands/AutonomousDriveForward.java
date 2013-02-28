/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.deca.decabotz.commands;

import edu.wpi.first.wpilibj.RobotDrive;
import org.deca.decabotz.RobotMap;

/**
 *
 * @author Sciencelab
 */
public class AutonomousDriveForward extends CommandBase {
    
    public AutonomousDriveForward() {
        requires(driveTrain);
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
        driveTrain.timedDrive(RobotMap.autonomousDriveForwardSpeed, RobotMap.autonomousDriveForwardTurn, RobotMap.autonomousDriveForwardTime);
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
