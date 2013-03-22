/*----------------------------------------------------------------------------*/
/* Copyright (c) FIRST 2008. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/
package org.deca.decabotz;

import edu.wpi.first.wpilibj.IterativeRobot;
import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.command.Scheduler;
import edu.wpi.first.wpilibj.smartdashboard.SendableChooser;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import org.deca.decabotz.commands.AutoGoalCorner;
import org.deca.decabotz.commands.AutoLeftGoalCorner;
import org.deca.decabotz.commands.CommandBase;

/**
 * The VM is configured to automatically run this class, and to call the
 * functions corresponding to each mode, as described in the IterativeRobot
 * documentation. If you change the name of this class or the package after
 * creating this project, you must also update the manifest file in the resource
 * directory.
 */
public class DecaBot extends IterativeRobot {
    
    Command autonomousCommand;
    SendableChooser autoChooser;

    //Command autonomousCommand;
    Command autoGoalCorner;
    Command autoGoalLeftCorner;
    
    /**
     * This function is run when the robot is first started up and should be
     * used for any initialization code.
     */
    public void robotInit() {
        // instantiate the command used for the autonomous period
        //autonomousCommand = new ExampleCommand();

        // Initialize all subsystems
        CommandBase.init();
       // autoGoalCorner = new AutoGoalCorner();
        
    // Option to select the autonomous code from the SmartDashboard
      // autoChooser = new SendableChooser();
        //autoChooser.addDefault("Goal Corner", new AutoGoalCorner());
       // autoChooser.addObject("Left Side of Goal", new AutoLeftGoalCorner());
        //SmartDashboard.putData("Autonomous mode chooser", autoChooser);
    }

    public void autonomousInit() {
        // schedule the autonomous command (example)
        //autonomousCommand.start();
        //autonomousCommand = (Command) autoChooser.getSelected();
        //autoGoalCorner.start();
    }

    /**
     * This function is called periodically during autonomous
     */
    public void autonomousPeriodic() {
        Scheduler.getInstance().run();
    }

    public void teleopInit() {
        // This makes sure that the autonomous stops running when
        // teleop starts running. If you want the autonomous to 
        // continue until interrupted by another command, remove
        // this line or comment it out.
        //autonomousCommand.cancel();
        updateStatus();
    }

    /**
     * This function is called periodically during operator control
     */
    public void teleopPeriodic() {
        Scheduler.getInstance().run();
        updateStatus();
    }
    
    public void disabledPeriod(){
        updateStatus();
    }
    
    public void updateStatus(){
        CommandBase.driveTrain.updateStatus();
        CommandBase.frontLifter.updateStatus();
        CommandBase.compressor.updateStatus();
    }
}
