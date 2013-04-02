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
public class HangHooks extends Subsystem {
    // Put methods for controlling this subsystem
    // here. Call these from Commands.

    Solenoid solenoidOneExtend;
    Solenoid solenoidOneRetract;

    public HangHooks() {
        solenoidOneExtend = new Solenoid(RobotMap.solenoidHangHooksExtendID);
        solenoidOneRetract = new Solenoid(RobotMap.solenoidHangHooksRetractID);
    }

    public void initDefaultCommand() {
        //setDefaultCommand(new RetractRearLift());

    }

    public void hookExtend() {
        solenoidOneExtend.set(true);
        solenoidOneRetract.set(false);
    }

    public void hookRetract() {
        solenoidOneExtend.set(false);
        solenoidOneRetract.set(true);
    }
}
