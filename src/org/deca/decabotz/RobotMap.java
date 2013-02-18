package org.deca.decabotz;

/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap {
    // Robot's configuration class.

    public static final int rightJagDriveID = 2,
                            leftJagDriveID = 3,
                            frontLiftJagID = 4,
                            shooterJagID = 5,
                            operatorGamepadID = 2,
                            solenoidOneExtendID = 1,
                            solenoidOneRetractID = 2,
                            solenoidTwoExtendID = 3,
                            solenoidTwoRetractID = 4,
                            rearLiftActivateID = 1,
                            gamepadID = 1,
                            leftJoyAxisID = 5,
                            rightJoyAxisID = 2,
                            operatorLeftJoyAxisID = 5,
                            operatorRightJoyAxisID = 2,
                            shooterForwardID = 1,
                            shooterBackwardID = 2;
    public static final double shooterSpeedID = 0.75;
}
