package org.deca.decabotz.commands;

import edu.wpi.first.wpilibj.can.CANTimeoutException;
import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import org.deca.decabotz.OI;
import org.deca.decabotz.subsystems.DriveTrain;
import org.deca.decabotz.subsystems.ExampleSubsystem;
import org.deca.decabotz.subsystems.FrontLifter;
import org.deca.decabotz.subsystems.RearLifter;

/**
 * The base for all commands. All atomic commands should subclass CommandBase.
 * CommandBase stores creates and stores each control system. To access a
 * subsystem elsewhere in your code in your code use
 * CommandBase.exampleSubsystem
 *
 * @author Author
 */
public abstract class CommandBase extends Command {

    public static OI oi;
    public static DriveTrain driveTrain;
    public static FrontLifter frontLifter;
    public static RearLifter rearLifter;
    // Create a single static instance of all of your subsystems
    public static ExampleSubsystem exampleSubsystem = new ExampleSubsystem();

    public static void init() {
        // This MUST be here. If the OI creates Commands (which it very likely
        // will), constructing it during the construction of CommandBase (from
        // which commands extend), subsystems are not guaranteed to be
        // yet. Thus, their requires() statements may grab null pointers. Bad
        // news. Don't move it.
        oi = new OI();

        // Pass if CAN errors happen.
        try {
            driveTrain = new DriveTrain();
        } catch (CANTimeoutException ex) {
            ex.printStackTrace();
        }
        try {
            frontLifter = new FrontLifter();
        } catch (CANTimeoutException ex) {
            ex.printStackTrace();
        }

        rearLifter = new RearLifter();



        // Show what command your subsystem is running on the SmartDashboard
        SmartDashboard.putData(exampleSubsystem);
    }

    public CommandBase(String name) {
        super(name);
    }

    public CommandBase() {
        super();
    }
}
