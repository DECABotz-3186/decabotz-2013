/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.deca.decabotz.subsystems;

import edu.wpi.first.wpilibj.CANJaguar;
import edu.wpi.first.wpilibj.can.CANTimeoutException;
import edu.wpi.first.wpilibj.command.Subsystem;
import org.deca.decabotz.RobotMap;
import org.deca.decabotz.commands.LiftShooter;

/**
 *
 * @author Sciencelab
 */
public class ShooterLift extends Subsystem {
    // Put methods for controlling this subsystem
    // here. Call these from Commands.
private CANJaguar shooterLiftJag;
    
public ShooterLift() throws CANTimeoutException{
    try{
        shooterLiftJag = new CANJaguar(RobotMap.shooterLiftJagID);
    } catch(CANTimeoutException e){
        throw e;
    }

}
    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
    public void setLift(double speedValue){
        try {
            if(shooterLiftJag != null){
            shooterLiftJag.setX(speedValue);
            }
        } catch (CANTimeoutException ex) {
                ex.printStackTrace();
        }
    }
}
