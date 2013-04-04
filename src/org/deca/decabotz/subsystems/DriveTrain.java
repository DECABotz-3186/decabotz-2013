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
        CANJaguar leftJag1;
        CANJaguar leftJag2;
        CANJaguar rightJag1;
        CANJaguar rightJag2;

    public DriveTrain() throws CANTimeoutException {
        try {
            leftJag1 = new CANJaguar(RobotMap.leftJagDrive1ID);
            leftJag2 = new CANJaguar(RobotMap.leftJagDrive2ID);
            rightJag1 = new CANJaguar(RobotMap.rightJagDrive1ID);
            rightJag2 = new CANJaguar(RobotMap.rightJagDrive2ID);
            drive = new RobotDrive(leftJag1, leftJag2, rightJag1, rightJag2);

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
        drive.tankDrive(-leftStick, rightStick);
    }
    public void timedDrive(double speed, double turn, double time){
        drive.drive(-speed, turn);
        Timer.delay(time);
        drive.drive(0, 0);
        
    }

    public void updateStatus() {
        try {
            SmartDashboard.putDouble("LeftDriveJag1", leftJag1.getOutputVoltage());
        } catch (CANTimeoutException ex) {
            SmartDashboard.putString("CANError", "CAN Problem reading leftJag1");
            ex.printStackTrace();
        }
        try {
            SmartDashboard.putDouble("LeftDriveJag2", leftJag2.getOutputVoltage());
        } catch (CANTimeoutException ex) {
            SmartDashboard.putString("CANError", "CAN Problem reading leftJag2");
            ex.printStackTrace();
        }
        try {
            SmartDashboard.putDouble("RightDriveJag1", rightJag1.getOutputVoltage());
        } catch (CANTimeoutException ex) {
            SmartDashboard.putString("CANError", "CAN Problem reading rightJag1");
            ex.printStackTrace();
        }
        try {
            SmartDashboard.putDouble("RightDrivJag2", rightJag2.getOutputVoltage());
        } catch (CANTimeoutException ex) {
            SmartDashboard.putString("CANError", "CAN Problem reading rightJag2");
        }
    }
}
