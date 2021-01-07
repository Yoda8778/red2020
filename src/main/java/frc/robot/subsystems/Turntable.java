/*----------------------------------------------------------------------------*/
/* Copyright (c) 2019 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;


import edu.wpi.first.wpilibj.VictorSP;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.RobotContainer;
import frc.robot.Robot;
import static frc.robot.Constants.TURN_CONST.*;


public class Turntable extends SubsystemBase {
  public VictorSP quay = new VictorSP(TURNTABLE_PWM);
  public Turntable() {
    //nothing
    }
  public void cock(double spin) {
    quay.set(spin);
    };
  @Override
  public void periodic() {
      cock(RobotContainer.stick.getRawAxis(0));
    }
  }

