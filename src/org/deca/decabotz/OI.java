package org.deca.decabotz;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.Button;
import edu.wpi.first.wpilibj.buttons.JoystickButton;
import org.deca.decabotz.commands.ExtendRearLift;
import org.deca.decabotz.commands.RetractRearLift;

/**
 * This class is the glue that binds the controls on the physical operator
 * interface to the commands and command groups that allow control of the robot.
 */
public class OI {

    Joystick operatorGamepad = new Joystick(RobotMap.operatorGamepadID);
    Joystick gamePad = new Joystick(RobotMap.gamepadID);
    Button rearLiftButton = new JoystickButton(operatorGamepad, RobotMap.rearLiftActivateID);

    public double getLeftStick() {
        return -gamePad.getRawAxis(2);
    }

    public double getRightStick() {
        return gamePad.getRawAxis(5);

    }

    public double getOperatorStick() {
        return operatorGamepad.getRawAxis(2);
    }

    public double getOperatorThrottle() {
        return operatorGamepad.getRawAxis(5);
    }

    public OI() {
        rearLiftButton.whenPressed(new ExtendRearLift());
        rearLiftButton.whenReleased(new RetractRearLift());
    }
   
}
