/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.deca.decabotz.subsystems;

import edu.wpi.first.wpilibj.CANJaguar;
import edu.wpi.first.wpilibj.can.CANTimeoutException;
import edu.wpi.first.wpilibj.command.Subsystem;
import org.deca.decabotz.RobotMap;
import org.deca.decabotz.commands.ShooterStop;

/**
 *
 * @author Sciencelab
 */
public class Shooter extends Subsystem {
    // Put methods for controlling this subsystem
    // here. Call these from Commands.
private CANJaguar shooterJag;

public Shooter() throws CANTimeoutException{
    try{
       shooterJag = new CANJaguar(RobotMap.shooterJagID); 
    } catch(CANTimeoutException e){
        throw e;
    }
    
}
    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
        setDefaultCommand(new ShooterStop());
    }
    public void forwardHigh(){
        try {
            shooterJag.setX(RobotMap.shooterSpeedHighID);
        } catch (CANTimeoutException ex) {
            ex.printStackTrace();
        }
    }
    public void forwardLow(){
        try {
            shooterJag.setX(RobotMap.shooterSpeedLowID);
        } catch (CANTimeoutException ex) {
            ex.printStackTrace();
        }
    }
    public void stop(){
        try {
            shooterJag.setX(0.0);
        } catch (CANTimeoutException ex) {
            ex.printStackTrace();
        }
    }
    
}
