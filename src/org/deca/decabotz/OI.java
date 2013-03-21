package org.deca.decabotz;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.Button;
import edu.wpi.first.wpilibj.buttons.JoystickButton;
import org.deca.decabotz.commands.ExtendChassisHooks;
import org.deca.decabotz.commands.ExtendRearLift;
import org.deca.decabotz.commands.RetractChassisHooks;
import org.deca.decabotz.commands.RetractRearLift;
import org.deca.decabotz.commands.ShooterBackward;
import org.deca.decabotz.commands.ShooterForward;
import org.deca.decabotz.commands.ShooterStop;
import org.deca.decabotz.commands.WedgePushExtend;
import org.deca.decabotz.commands.WedgePushRetract;

/**
 * This class is the glue that binds the controls on the physical operator
 * interface to the commands and command groups that allow control of the robot.
 */
public class OI {

    Joystick operatorGamepad = new Joystick(RobotMap.operatorGamepadID);
    Joystick gamePad = new Joystick(RobotMap.gamepadID);
    Button chassisHooksActivateButton = new JoystickButton(operatorGamepad, RobotMap.chassisHooksActivateID);
    Button chassisHooksDeactivateButton = new JoystickButton(operatorGamepad, RobotMap.chassisHooksDeactivateID);
    Button rearLiftButton = new JoystickButton(gamePad, RobotMap.rearLiftActivateID);
    Button shooterForwardButton = new JoystickButton(gamePad, RobotMap.shooterForwardID);
    Button shooterBackwardButton = new JoystickButton(gamePad, RobotMap.shooterBackwardID);
    Button wedgePushExtendButton = new JoystickButton(operatorGamepad, RobotMap.wedgePushExtendID);
    Button wedgePushRetractButton = new JoystickButton(operatorGamepad, RobotMap.wedgePushRetractID);
    
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
        chassisHooksActivateButton.whenPressed(new ExtendChassisHooks());
        chassisHooksDeactivateButton.whenPressed(new RetractChassisHooks());
        rearLiftButton.whenPressed(new ExtendRearLift());
        rearLiftButton.whenReleased(new RetractRearLift());
        shooterForwardButton.whenPressed(new ShooterForward());
        shooterForwardButton.whenReleased(new ShooterStop());
        shooterBackwardButton.whenPressed(new ShooterBackward());
        shooterBackwardButton.whenReleased(new ShooterStop());
        wedgePushExtendButton.whenPressed(new WedgePushExtend());
        wedgePushRetractButton.whenPressed(new WedgePushRetract());

      
    }
   
}
