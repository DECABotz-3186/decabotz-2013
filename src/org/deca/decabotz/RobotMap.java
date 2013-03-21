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
                            solenoidRearLiftExtendID = 4,
                            solenoidRearLiftRetractID = 1,
                            solenoidChassisHooksRetractID = 2,
                            solenoidChassisHooksExtendID = 3,
                            solenoidWedgeRetractID = 5,
                            solenoidWedgeExtendID = 6,
                            rearLiftActivateID = 4,
                            chassisHooksActivateID = 3,
                            gamepadID = 1,
                            leftJoyAxisID = 5,
                            rightJoyAxisID = 2,
                            operatorLeftJoyAxisID = 2,
                            operatorRightJoyAxisID = 5,
                            shooterForwardID = 1, //button A
                            shooterBackwardID = 2, //button B
                            wedgePushExtendID = 2,
                            wedgePushRetractID = 4,
                            compressorRelayID = 1,
                            compressorSwitchID = 1;
    public static final double shooterSpeedID = 0.75,
                                autonomousDriveForwardSpeed= 1,
                                autonomousDriveForwardTurn= 0,
                                autonomousDriveForwardTime= 5,
                                autonomousShooterTime= 5,
                                autonomousDriveLeftSpeed= 1,
                                autonomousDriveLeftTurn = 1,
                                autonomousDriveLeftTime = 2;
                                   
}
