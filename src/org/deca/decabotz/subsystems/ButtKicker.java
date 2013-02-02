/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.deca.decabotz.subsystems;

import edu.wpi.first.wpilibj.CANJaguar;
import edu.wpi.first.wpilibj.can.CANTimeoutException;
import edu.wpi.first.wpilibj.command.Subsystem;
import org.deca.decabotz.RobotMap;
import org.deca.decabotz.commands.Kick;

/**
 *
 * @author Sciencelab
 */
public class ButtKicker extends Subsystem {
    // Put methods for controlling this subsystem
    // here. Call these from Commands.
    CANJaguar buttKickerJag;
    public ButtKicker() {
        try {
            buttKickerJag = new CANJaguar(RobotMap.buttKickerJagID);
        } catch (CANTimeoutException ex) {
            ex.printStackTrace();
        }
    }
    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
        setDefaultCommand(new Kick());
    }
    public void setKicker(double speedValue) {
        try {
            buttKickerJag.setX(speedValue);
        } catch (CANTimeoutException ex) {
            ex.printStackTrace();
        }
    }
}
