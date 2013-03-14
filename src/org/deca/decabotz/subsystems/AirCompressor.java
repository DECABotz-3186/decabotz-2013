/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.deca.decabotz.subsystems;

import edu.wpi.first.wpilibj.Compressor;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.livewindow.LiveWindow;
import org.deca.decabotz.RobotMap;

/**
 *
 * @author Sciencelab
 */
public class AirCompressor extends Subsystem {
    // Put methods for controlling this subsystem
    // here. Call these from Commands.
    private Compressor compressor;
    
    public AirCompressor(){
        
        compressor = new Compressor(RobotMap.compressorRelayID,RobotMap.compressorSwitchID);
        
        compressor.start();
        LiveWindow.addActuator("AirCompressor", "compressor", compressor);
    }

    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
        
    }
}
