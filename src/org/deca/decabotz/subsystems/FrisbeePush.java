/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.deca.decabotz.subsystems;

import edu.wpi.first.wpilibj.Relay;
import edu.wpi.first.wpilibj.command.Subsystem;
import org.deca.decabotz.RobotMap;
import org.deca.decabotz.commands.StopFrisbeePush;

/**
 *
 * @author Sciencelab
 */
public class FrisbeePush extends Subsystem {
    // Put methods for controlling this subsystem
    // here. Call these from Commands.
    
    private Relay frisbeePushMotor;
    private boolean pushFrisbee;

    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
        setDefaultCommand(new StopFrisbeePush());
    }
    
    public FrisbeePush() {
        frisbeePushMotor = new Relay(RobotMap.frisbeePushRelayID, Relay.Direction.kForward);
        stopFrisbeePush();
    }
    
    public void startFrisbeePush() {
        frisbeePushMotor.set(Relay.Value.kForward);
        pushFrisbee = true;
    }
    
    public void reverseFrisbeePush() {
        frisbeePushMotor.set(Relay.Value.kReverse);
        pushFrisbee = true;
    }

    public void stopFrisbeePush() {
        frisbeePushMotor.set(Relay.Value.kOff);
        pushFrisbee = false;
    }
    
    public boolean isRunning() {
        return pushFrisbee;
    }
}
