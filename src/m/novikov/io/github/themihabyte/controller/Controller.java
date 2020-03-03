package m.novikov.io.github.themihabyte.controller;

import m.novikov.io.github.themihabyte.model.Service;
import m.novikov.io.github.themihabyte.view.View;

public class Controller {
    Service service;
    View view;
    int n = 10;

    public void run(){
        boolean run = true;

        service.setStudents(n);

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
                    run = false;
                    break;
            }
        } while (run);
    }

    public Controller() {
        this.service = new Service();
        this.view = new View();
    }

    private void showAllStudentsList(){
        view.students(service.getStudents());
    }

    private void showExcellentSecondYearStudents(){
        view.students(service.getExcellentSecondYearStudents());
    }

    private void showForeignWellStudyingStudents(){
        view.students(service.getForeignWellStudyingStudents());
    }
}
