/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.deca.decabotz.subsystems;

import edu.wpi.first.wpilibj.CANJaguar;
import edu.wpi.first.wpilibj.can.CANTimeoutException;
import edu.wpi.first.wpilibj.command.Subsystem;
import org.deca.decabotz.RobotMap;

/**
 *
 * @author Sciencelab
 */
public class RearLifter extends Subsystem {
    // Put methods for controlling this subsystem
    // here. Call these from Commands.
    CANJaguar rearLiftJag;
    public RearLifter() throws CANTimeoutException {
        try {
            rearLiftJag = new CANJaguar(RobotMap.rearLiftJagID);
        } catch (CANTimeoutException ex) {
            throw ex;
        }
    }
    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
        setDefaultCommand(new org.deca.decabotz.commands.RearLift());
    }
    public void setRearLifter(double speedValue) {
        try {
            rearLiftJag.setX(speedValue);
        } catch (CANTimeoutException ex) {
            ex.printStackTrace();
        }
    }
}
