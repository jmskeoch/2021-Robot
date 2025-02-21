/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018-2019 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot;

import edu.wpi.first.wpilibj.kinematics.DifferentialDriveKinematics;

/**
 * The Constants class provides a convenient place for teams to hold robot-wide numerical or boolean
 * constants.  This class should not be used for any other purpose.  All constants should be
 * declared globally (i.e. public static).  Do not put anything functional in this class.
 *
 * <p>It is advised to statically import this class (or one of its inner classes) wherever the
 * constants are needed, to reduce verbosity.
 */
public final class Constants {

    public static final class DriveConstants {

        /**
         * Change these to 0, 1, 2, 3 if they aren't there
         */
        public static final int leftMotor1Port = 9;
        public static final int leftMotor2Port = 10;
        public static final int rightMotor1Port = 11;
        public static final int rightMotor2Port = 12;

        public static final int encoderLeftA = 1;
        public static final int encoderLeftB = 2;
        public static final int encoderRightA = 5;
        public static final int encoderRightB = 6;
        public static final double speedScale = 0.65; //0.8 //(0.65 CLUB FAIR)


        public static final double EncoderDistancePerPulse = 1.0 / 2048.0;
        public static final double minDrivePower = 0.20; //0.16, 20

        public static final double minDrivePowerTurn = 0.36; //0.35, 40

        public static final double maxDriveSpeed = 0.7; //0.9  //(0.7 CLUB FAIR)

    }

    public static final class AutonomousConstants {

        public static final double ksVolts = 0.8; //1.31;
        public static final double kvVoltSecondsPerMeter = 0.3; //1.98
        public static final double kaVoltSecondsSquaredPerMeter = 0.04; //0.156
        public static final double kPDriveVel = 0.538;
        public static final double kTrackwidthMeters = 0.65;
        public static final DifferentialDriveKinematics kDriveKinematics =
                new DifferentialDriveKinematics(kTrackwidthMeters);
        public static final double kMaxSpeedMetersPerSecond = 1;
        public static final double kMaxAccelerationMetersPerSecondSquared = 1;
        public static final double kRamseteB = 2;
        public static final double kRamseteZeta = 0.7;
    }

    public static final class OIConstants {
        public static final int xboxControllerPort = 0;
        public static final int fightStickPort = 1;
    }

    public static final class MechanismConstants {
        public static final int intakeMotorPort = 8;
        public static final int shooterMotorPort = 7;
        public static final int colorWheelMotorPort = 6;

        public static final int leftTelescopeMotorPort = 1;
        public static final int rightTelescopeMotorPort = 2;
        public static final int leftWinchMotorPort = 5; //not wired yet
        public static final int rightWinchMotorPort = 3; //not wired yet


    }

    public static final class PneumaticsConstants {
        public static final int gatePort = 0;
        public static final int dumperPort = 1;
        public static final int colorWheelLiftPort = 2;
        public static final int colorSensorPortIn = 3;
        public static final int colorSensorPortOut = 4;

    }
}