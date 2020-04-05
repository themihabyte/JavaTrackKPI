package m.novikov.io.github.themihabyte.controller;

import m.novikov.io.github.themihabyte.model.Service;
import m.novikov.io.github.themihabyte.view.View;

public class Controller {
    private final Service service;
    private final View view;

    public void run(){
        service.setStudents();

        do {
            switch (view.menu()) {
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
        this.service = new Service();
        this.view = new View();
    }

    private void showAllStudentsList(){
        view.displayStudents(service.getStudents());
    }

    private void showExcellentSecondYearStudents(){
        view.displayStudents(service.getExcellentSecondYearStudents());
    }

    private void showForeignWellStudyingStudents(){
        view.displayStudents(service.getForeignWellStudyingStudents());
    }
}
