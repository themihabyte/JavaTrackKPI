package m.novikov.io.github.themihabyte.controller;

import m.novikov.io.github.themihabyte.model.Service;
import m.novikov.io.github.themihabyte.model.Student;
import m.novikov.io.github.themihabyte.view.View;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;


import java.io.IOException;



public class Controller {
    private final Service service;
    private final View view;
    private static final Logger logger=LogManager.getLogger(Controller.class);

    public void run() {
        logger.debug("Start");
        try {
            service.setStudents();
        } catch (IOException e) {
            view.showErrorMessage("There was an error loading information");
            logger.fatal("Error loading information");
            System.exit(-1);
        }

        do {
            switch (view.displayMenu()) {
                case 1:
                    showAllStudentsList();
                    break;
                case 2:
                    showExcellentSecondYearStudents();
                    break;
                case 3:
                    showForeignWellStudyingStudents();
                    break;
                case 4:
                    logger.debug("Exit");
                    System.exit(1);
            }
        } while (true);
    }

    public Controller() {
        this.service=new Service();
        this.view=new View();
    }

    private void showAllStudentsList() {
        view.displayStudents(service.getStudents());
    }

    private void showExcellentSecondYearStudents() {
        Student[] students=service.getExcellentSecondYearStudents();
        view.displayStudents(students);
        saveResultToFile(students);
    }

    private void showForeignWellStudyingStudents() {
        Student[] students=service.getForeignWellStudyingStudents();
        view.displayStudents(students);
        saveResultToFile(students);
    }

    private void saveResultToFile(Student[] students) {
        if (view.askAboutSavingInFile()) {
            try {
                service.writeStudentsToFile(students, view.getFilepath());
            } catch (IOException e) {
                view.showErrorMessage("There is an error writing to file");
                logger.error("There is an error writing to file");
            }
        }
    }
}
