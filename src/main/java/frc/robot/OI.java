package frc.robot;

import com.pathplanner.lib.commands.PathPlannerAuto;

import edu.wpi.first.wpilibj.XboxController;
import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.button.CommandXboxController;

//Import Subsystems and Command files Below


public class OI {
    //Define controller ports | DO NOT TOUCH |
    final CommandXboxController manipController = new CommandXboxController(1);
    final CommandXboxController driveController = new CommandXboxController(0);

    //Define all subsystems using "IntakeSubsystem IntakeSubsystem = new IntakeSubsystem();"
    //IntakeSubsystem IntakeSubsystem = new IntakeSubsystem();

    //Creates Bindings for controllers
    public OI() {
        configureBindings();
    }


    private void configureBindings() {
        //PUT YOUR COMMANDS in here! Default commands go first.  
        //manipController.a().whileTrue(new Intake(IntakeSubsystem));

    }

    public Command getAutonomousCommand() {
        // AUTOS not PATHS in path planner should be called here
        return new PathPlannerAuto("AutoName");
    }


}