package m.novikov.io.github.themihabyte.controller;

import m.novikov.io.github.themihabyte.model.Service;
import m.novikov.io.github.themihabyte.view.View;

public class Controller {
    Service service;
    View view;

    public void run(){
        boolean run = true;
        service.setStudents(10);
        do {
            switch (view.menu()) {
                case 1:
                    showAllStudentsList();
                    break;
                case 2:
                    // TODO show excellent second-year students
                    break;
                case 3:
                    // TODO show foreign well-studying students
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
}
