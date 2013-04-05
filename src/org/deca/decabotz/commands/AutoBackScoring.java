/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.deca.decabotz.commands;

import edu.wpi.first.wpilibj.Timer;
import edu.wpi.first.wpilibj.command.CommandGroup;
import org.deca.decabotz.RobotMap;

/**
 *
 * @author Sciencelab
 */
public class AutoBackScoring extends CommandGroup {
    
    public AutoBackScoring() {
        // Add Commands here:
        // e.g. addSequential(new Command1());
        //      addSequential(new Command2());
        // these will run in order.

        // To run multiple commands at the same time,
        // use addParallel()
        // e.g. addParallel(new Command1());
        //      addSequential(new Command2());
        // Command1 and Command2 will run in parallel.

        // A command group will require all of the subsystems that each member
        // would require.
        // e.g. if Command1 requires chassis, and Command2 requires arm,
        // a CommandGroup containing them would require both the chassis and the
        // arm.
        addParallel(new ShooterHigh());
        Timer.delay(RobotMap.frisbeePushDelayTime);
        addSequential(new ToggleFrisbeePush());
        Timer.delay(RobotMap.frisbeePushTime);
        addSequential(new StopFrisbeePush());
        Timer.delay(RobotMap.frisbeePushDelayTime);
        addSequential(new ToggleFrisbeePush());
        Timer.delay(RobotMap.frisbeePushTime);
        addSequential(new ToggleFrisbeePush());
        addParallel(new ShooterStop());
        addSequential(new StopFrisbeePush());
        
        
    }
}
