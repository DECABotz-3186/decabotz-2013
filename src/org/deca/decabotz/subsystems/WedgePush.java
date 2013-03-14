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
public class WedgePush extends Subsystem {
    // Put methods for controlling this subsystem
    // here. Call these from Commands.
    
    Solenoid solenoidThreeExtend;
    Solenoid solenoidThreeRetract;
    
    public WedgePush() {
        solenoidThreeExtend = new Solenoid(RobotMap.solenoidThreeExtendID);
        solenoidThreeRetract = new Solenoid(RobotMap.solenoidThreeRetractID);
        LiveWindow.addActuator("WedgePush", "solenoidExtend", solenoidThreeExtend);
        LiveWindow.addActuator("WedgePush", "solenoidRetract", solenoidThreeRetract);
    }

    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
    public void wedgeExtend () {
        solenoidThreeExtend.set(true);
        solenoidThreeRetract.set(false);
    }
    public void wedgeRetract () {
        solenoidThreeExtend.set(false);
        solenoidThreeRetract.set(true);
    }
}
