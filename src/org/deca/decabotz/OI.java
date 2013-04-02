package org.deca.decabotz;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.Button;
import edu.wpi.first.wpilibj.buttons.JoystickButton;
import org.deca.decabotz.commands.StartSpeedBoost;
import org.deca.decabotz.commands.ExtendHangHooks;
import org.deca.decabotz.commands.StopSpeedBoost;
import org.deca.decabotz.commands.RetractHangHooks;
import org.deca.decabotz.commands.ShooterHigh;
import org.deca.decabotz.commands.ShooterLow;
import org.deca.decabotz.commands.ShooterStop;
import org.deca.decabotz.commands.ToggleFrisbeePush;

/**
 * This class is the glue that binds the controls on the physical operator
 * interface to the commands and command groups that allow control of the robot.
 */
public class OI {
    //button layout needs to be changed and things need to go to operatorGamepad
    Joystick operatorGamepad = new Joystick(RobotMap.operatorGamepadID);
    Joystick gamePad = new Joystick(RobotMap.gamepadID);
    Button speedBoostActivateButton = new JoystickButton(operatorGamepad, RobotMap.speedBoostActivateID);
    Button speedBoostDeactivateButton = new JoystickButton(operatorGamepad, RobotMap.speedBoostDeactivateID);
    Button hangHooksButton = new JoystickButton(gamePad, RobotMap.hangHooksActivateID);
    Button shooterHighButton = new JoystickButton(gamePad, RobotMap.shooterHighID);
    Button shooterLowButton = new JoystickButton(gamePad, RobotMap.shooterLowID);
    Button frisbeePushButton = new JoystickButton(operatorGamepad, RobotMap.frisbeePushID);
    //Button wedgePushExtendButton = new JoystickButton(operatorGamepad, RobotMap.wedgePushExtendID);
    //Button wedgePushRetractButton = new JoystickButton(operatorGamepad, RobotMap.wedgePushRetractID);
    
    // Possibly reverse.
    public double getLeftStick() {
        return gamePad.getRawAxis(RobotMap.leftJoyAxisID);
    }

    public double getRightStick() {
        return gamePad.getRawAxis(RobotMap.rightJoyAxisID);

    }

    public double getOperatorStick() {
        return operatorGamepad.getRawAxis(RobotMap.operatorLeftJoyAxisID);
    }

    public double getOperatorThrottle() {
        return operatorGamepad.getRawAxis(RobotMap.operatorRightJoyAxisID);
    }
    

    public OI() {
        speedBoostActivateButton.whenPressed(new StartSpeedBoost());
        speedBoostDeactivateButton.whenPressed(new StopSpeedBoost());
        hangHooksButton.whenPressed(new ExtendHangHooks());
        hangHooksButton.whenReleased(new RetractHangHooks());
        shooterHighButton.whenPressed(new ShooterHigh());
        shooterHighButton.whenReleased(new ShooterStop());
        shooterLowButton.whenPressed(new ShooterLow());
        shooterLowButton.whenReleased(new ShooterStop());
        frisbeePushButton.whenPressed(new ToggleFrisbeePush());

      
    }
   
}
