package org.deca.decabotz;

/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap {
    // Robot's configuration class.

    public static final int rightJagDrive1ID = 2,
                            rightJagDrive2ID = 3,
                            leftJagDrive1ID = 4,
                            leftJagDrive2ID = 5,
                            shooterJagID = 6,
                            shooterLiftJagID = 7,
                            operatorGamepadID = 2,
                            solenoidHangHooksExtendID = 2,
                            solenoidHangHooksRetractID = 3,
                            solenoidSpeedBoostStopID = 4,
                            solenoidSpeedBoostStartID = 1,
                            //solenoidWedgeRetractID = 5,
                            //solenoidWedgeExtendID = 6,
                            hangHooksActivateID = 1,
                            speedBoostActivateID = 5,
                            speedBoostDeactivateID = 6,
                            gamepadID = 1,
                            leftJoyAxisID = 2,
                            rightJoyAxisID = 5,
                            operatorLeftJoyAxisID = 2,
                            operatorRightJoyAxisID = 5,
                            shooterHighID = 1, //button A
                            shooterLowID = 2, //button B
                            frisbeePushID = 3,
                            //wedgePushExtendID = 2,
                            //wedgePushRetractID = 4,
                            compressorRelayID = 1,
                            frisbeePushRelayID = 2,
                            compressorSwitchID = 1;
    public static final double  shooterSpeedLowID = 0.75,
                                shooterSpeedHighID = 1.0,
                                autonomousDriveBackwardSpeed = -1,
                                autonomousDriveBackwardTurn = 0,
                                autonomousDriveBackwardTime = 3,
                                autonomousShooterTime= 5,
                                autonomousDriveLeftSpeed= 1,
                                autonomousDriveLeftTurn = 1,
                                autonomousDriveLeftTime = 1,
                                frisbeePushTime = 0.8,
                                frisbeePushDelayTime = 1.25,
                                beginAutoDelay = 7,
                                shooterLiftID = 1,
                                frontAutoAngleTime = 1.15,
                                backAutoAngleTime = 0.9;
                                 
}
