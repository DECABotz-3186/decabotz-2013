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
public class RearLifter extends Subsystem {
    // Put methods for controlling this subsystem
    // here. Call these from Commands.

    Solenoid solenoidOneExtend;
    Solenoid solenoidOneRetract;

    public RearLifter() {
        solenoidOneExtend = new Solenoid(RobotMap.solenoidOneExtendID);
        solenoidOneRetract = new Solenoid(RobotMap.solenoidOneRetractID);
        
        LiveWindow.addActuator("RearLifter", "solenoidExtend", solenoidOneExtend);
        LiveWindow.addActuator("RearLifter", "solenoidRetract", solenoidOneRetract);
    }

    public void initDefaultCommand() {
        //setDefaultCommand(new RetractRearLift());

    }

    public void liftExtend() {
        solenoidOneExtend.set(true);
        solenoidOneRetract.set(false);
    }

    public void liftRetract() {
        solenoidOneExtend.set(false);
        solenoidOneRetract.set(true);
    }
}
