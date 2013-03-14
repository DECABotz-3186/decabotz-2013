/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.deca.decabotz.subsystems;

import edu.wpi.first.wpilibj.Solenoid;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.livewindow.LiveWindow;
import org.deca.decabotz.RobotMap;

/**
 *
 * @author Sciencelab
 */
public class ChassisHooks extends Subsystem {
    // Put methods for controlling this subsystem
    // here. Call these from Commands.
    
    Solenoid solenoidTwoExtend;
    Solenoid solenoidTwoRetract;
    
    public ChassisHooks() {
        
        solenoidTwoExtend = new Solenoid(RobotMap.solenoidTwoExtendID);
        solenoidTwoRetract = new Solenoid(RobotMap.solenoidTwoRetractID);
        
        LiveWindow.addActuator("ChassisHooks", "extend", solenoidTwoExtend);
        LiveWindow.addActuator("ChassisHooks", "retract", solenoidTwoRetract);
    }

    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
           
    }
    
    public void hookExtend() {
            
        solenoidTwoExtend.set(true);
        solenoidTwoRetract.set(false);
        
    }
    
    public void hookRetract() {
        solenoidTwoExtend.set(false);
        solenoidTwoRetract.set(true);
            
    }
}
