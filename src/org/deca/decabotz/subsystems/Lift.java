/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.deca.decabotz.subsystems;

import edu.wpi.first.wpilibj.CANJaguar;
import edu.wpi.first.wpilibj.can.CANTimeoutException;
import edu.wpi.first.wpilibj.command.Subsystem;
import org.deca.decabotz.RobotMap;
import org.deca.decabotz.commands.MoveLift;

/**
 *
 * @author Sciencelab
 */
public class Lift extends Subsystem {
    CANJaguar liftJag;
    public Lift(){
        try {
            liftJag = new CANJaguar(RobotMap.liftJagID);
        } catch (CANTimeoutException ex) {
            ex.printStackTrace();
        }
        
    }
            
    // Put methods for controlling this subsystem
    // here. Call these from Commands.

    
    public void initDefaultCommand() {
     
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
        setDefaultCommand(new MoveLift());
    }
    public void setLift (double speedValue){
        try {
            liftJag.setX(speedValue);
        } catch (CANTimeoutException ex) {
            ex.printStackTrace();
        }
    }
}
