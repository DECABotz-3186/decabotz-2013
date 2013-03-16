package org.deca.decabotz.commands;

import edu.wpi.first.wpilibj.Compressor;
import edu.wpi.first.wpilibj.can.CANTimeoutException;
import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import org.deca.decabotz.OI;
import org.deca.decabotz.subsystems.AirCompressor;
import org.deca.decabotz.subsystems.ChassisHooks;
import org.deca.decabotz.subsystems.DriveTrain;
import org.deca.decabotz.subsystems.FrontLifter;
import org.deca.decabotz.subsystems.RearLifter;
import org.deca.decabotz.subsystems.Shooter;
import org.deca.decabotz.subsystems.WedgePush;

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
    public static Shooter shooter;
    public static ChassisHooks chassisHooks;
    public static WedgePush wedgePush;
    public static AirCompressor compressor;
    // Create a single static instance of all of your subsystems

    public static void init() {
        // This MUST be here. If the OI creates Commands (which it very likely
        // will), constructing it during the construction of CommandBase (from
        // which commands extend), subsystems are not guaranteed to be
        // yet. Thus, their requires() statements may grab null pointers. Bad
        // news. Don't move it.
       

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
        try {
            shooter = new Shooter();
        } catch (CANTimeoutException ex) {
            ex.printStackTrace();
            
        }

        rearLifter = new RearLifter();
        
        oi = new OI();
        
        compressor = new AirCompressor();

        // Show what command your subsystem is running on the SmartDashboard
        SmartDashboard.putData(driveTrain);
        SmartDashboard.putData(frontLifter);
        SmartDashboard.putData(shooter);
        SmartDashboard.putData(compressor);
    }

    public CommandBase(String name) {
        super(name);
    }

    public CommandBase() {
        super();
    }
}
