/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.deca.decabotz.subsystems;

import edu.wpi.first.wpilibj.CANJaguar;
import edu.wpi.first.wpilibj.can.CANTimeoutException;
import edu.wpi.first.wpilibj.command.Subsystem;
import org.deca.decabotz.RobotMap;
import org.deca.decabotz.commands.FrontLift;

/**
 *
 * @author Sciencelab
 */
public class FrontLifter extends Subsystem {

    CANJaguar liftJag;

    public FrontLifter() throws CANTimeoutException {
        try {
            liftJag = new CANJaguar(RobotMap.frontLiftJagID);
        } catch (CANTimeoutException ex) {
            throw ex;
        }

    }

    // Put methods for controlling this subsystem
    // here. Call these from Commands.
    public void initDefaultCommand() {

        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
        setDefaultCommand(new FrontLift());
    }

    public void setLift(double speedValue) {
        try {
            if (liftJag != null) {
                liftJag.setX(speedValue);
            }
        } catch (CANTimeoutException ex) {
            ex.printStackTrace();
        }
    }
}
