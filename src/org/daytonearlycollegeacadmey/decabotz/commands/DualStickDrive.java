/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.daytonearlycollegeacadmey.decabotz.commands;

/**
 *
 * @author decabots
 */
public class DualStickDrive extends CommandBase {
    
    public DualStickDrive() {
            requires(driveTrain);
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
        driveTrain.tankDrive(oi.getLeftStick(),oi.getRightStick());
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
