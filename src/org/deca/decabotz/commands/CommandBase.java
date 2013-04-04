package org.deca.decabotz.commands;

import edu.wpi.first.wpilibj.can.CANTimeoutException;
import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import org.deca.decabotz.OI;
import org.deca.decabotz.subsystems.AirCompressor;
import org.deca.decabotz.subsystems.DriveTrain;
import org.deca.decabotz.subsystems.FrisbeePush;
import org.deca.decabotz.subsystems.HangHooks;
import org.deca.decabotz.subsystems.Shooter;
import org.deca.decabotz.subsystems.ShooterLift;
import org.deca.decabotz.subsystems.SpeedBoost;

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
    public static HangHooks hangHooks;
    public static Shooter shooter;
    public static SpeedBoost speedBoost;
    public static AirCompressor compressor;
    public static ShooterLift shooterLift;
    public static FrisbeePush frisbeePush;
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
            shooter = new Shooter();
        } catch (CANTimeoutException ex) {
            ex.printStackTrace();    
        }
        try {
            shooterLift = new ShooterLift();
        } catch (CANTimeoutException ex) {
            ex.printStackTrace();
        }
        hangHooks = new HangHooks();
        
        
        
        compressor = new AirCompressor();
        
        speedBoost = new SpeedBoost();
        
        frisbeePush = new FrisbeePush();
        
        // Init() all subsystems before oi
        oi = new OI();
         

        // Show what command your subsystem is running on the SmartDashboard
        SmartDashboard.putData(driveTrain);
        SmartDashboard.putData(shooter);
        SmartDashboard.putData(compressor);
        SmartDashboard.putData(shooterLift);
    }

    public CommandBase(String name) {
        super(name);
    }

    public CommandBase() {
        super();
    }
}
