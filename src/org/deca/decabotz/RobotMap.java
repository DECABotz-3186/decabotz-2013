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
                            operatorGamepadID = 2,
                            solenoidRearLiftExtendID = 4,
                            solenoidRearLiftRetractID = 1,
                            solenoidChassisHooksRetractID = 2,
                            solenoidChassisHooksExtendID = 3,
                            //solenoidWedgeRetractID = 5,
                            //solenoidWedgeExtendID = 6,
                            rearLiftActivateID = 4,
                            chassisHooksActivateID = 3,
                            chassisHooksDeactivateID = 1,
                            gamepadID = 1,
                            leftJoyAxisID = 5,
                            rightJoyAxisID = 2,
                            operatorLeftJoyAxisID = 2,
                            operatorRightJoyAxisID = 5,
                            shooterHighID = 1, //button A
                            shooterLowID = 2, //button B
                            wedgePushExtendID = 2,
                            wedgePushRetractID = 4,
                            compressorRelayID = 1,
                            compressorSwitchID = 1;
    public static final double  shooterSpeedLowID = 0.50,
                                shooterSpeedHighID = 0.75,
                                autonomousDriveBackwardSpeed = -1,
                                autonomousDriveBackwardTurn = 0,
                                autonomousDriveBackwardTime = 3,
                                autonomousShooterTime= 5,
                                autonomousDriveLeftSpeed= 1,
                                autonomousDriveLeftTurn = 1,
                                autonomousDriveLeftTime = 1;
                                   
}
