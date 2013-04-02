/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.deca.decabotz.subsystems;

import edu.wpi.first.wpilibj.Solenoid;
import edu.wpi.first.wpilibj.command.Subsystem;
import org.deca.decabotz.RobotMap;

/**
 *
 * @author Sciencelab
 */
public class SpeedBoost extends Subsystem {
    // Put methods for controlling this subsystem
    // here. Call these from Commands.
    
    Solenoid solenoidTwoStartBoost;
    Solenoid solenoidTwoEndBoost;
    
    public SpeedBoost() {
        
        solenoidTwoStartBoost = new Solenoid(RobotMap.solenoidSpeedBoostStartID);
        //TODO: FIX ME
        solenoidTwoEndBoost = new Solenoid(RobotMap.solenoidSpeedBoostStopID);
    }

    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
           
    }
    
    public void startBoost() {
            
        solenoidTwoStartBoost.set(true);
        solenoidTwoEndBoost.set(false);
        
    }
    
    public void stopBoost() {
        solenoidTwoStartBoost.set(false);
        solenoidTwoEndBoost.set(true);
            
    }
}
