package m.novikov.io.github.themihabyte.controller;

import m.novikov.io.github.themihabyte.model.Service;
import m.novikov.io.github.themihabyte.model.Student;
import m.novikov.io.github.themihabyte.view.View;

public class Controller {
    private final Service service;
    private final View view;

    public void run() {
        service.setStudents(); // TODO exception

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
            service.writeStudentsToFile(students, view.getFilepath());
        }
    }
}
