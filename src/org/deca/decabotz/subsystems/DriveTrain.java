/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.deca.decabotz.subsystems;

import edu.wpi.first.wpilibj.CANJaguar;
import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.Timer;
import edu.wpi.first.wpilibj.can.CANTimeoutException;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import org.deca.decabotz.RobotMap;
import org.deca.decabotz.commands.DualStickDrive;

/**
 *
 * @author decabots
 */
public class DriveTrain extends Subsystem {
    // Put methods for controlling this subsystem
    // here. Call these from Commands.

    private RobotDrive drive;
        CANJaguar leftJag;
        CANJaguar rightJag;

    public DriveTrain() throws CANTimeoutException {
        try {
            leftJag = new CANJaguar(RobotMap.leftJagDriveID);
            rightJag = new CANJaguar(RobotMap.rightJagDriveID);
            drive = new RobotDrive(leftJag, rightJag);

            drive.setSafetyEnabled(false);
        } catch (CANTimeoutException e) {
            throw e;
        }
    }

    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
        setDefaultCommand(new DualStickDrive());
    }

    public void tankDrive(double leftStick, double rightStick) {
        drive.tankDrive(leftStick, rightStick);
    }
    public void timedDrive(double speed, double turn, double time){
        drive.drive(-speed, turn);
        Timer.delay(time);
        drive.drive(0, 0);
        
    }

    public void updateStatus() {
        try {
            SmartDashboard.putDouble("LeftDriveJag", leftJag.getOutputVoltage());
        } catch (CANTimeoutException ex) {
            SmartDashboard.putString("CanError", "Can Problem reading leftJag");
            ex.printStackTrace();
        }
        try {
            SmartDashboard.putDouble("RightDriveJag", rightJag.getOutputVoltage());
        } catch (CANTimeoutException ex) {
            SmartDashboard.putString("CanError", "Can Problem reading rightJag");
            ex.printStackTrace();
        }
        
    }
}
