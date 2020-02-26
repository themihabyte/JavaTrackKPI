package m.novikov.io.github.themihabyte.controller;

import m.novikov.io.github.themihabyte.model.Service;
import m.novikov.io.github.themihabyte.view.View;

public class Controller {
    Service service;
    View view;
    int n = 10; // Number of students

    // Start program with this method
    public void run(){
        boolean run = true; // When false - exit from program

        service.setStudents(n); // Get n students from some data source

        do {
            // Menu cycle
            switch (view.menu()) {
                case 1:
                    showAllStudentsList(); // Display all students from source
                    break;
                case 2:
                    showExcellentSecondYearStudents();
                    break;
                case 3:
                    showForeignWellStudyingStudents();
                    break;
                case 4:
                    run = false; // Exit from program
                    break;
            }
        } while (run);
    }

    public Controller() {
        this.service = new Service();
        this.view = new View();
    }

    // Displays all students on screen
    private void showAllStudentsList(){
        view.students(service.getStudents());
    }

    // Displays only excellent second-year students
    private void showExcellentSecondYearStudents(){
        view.students(service.getExcellentSecondYearStudents());
    }

    // Displays only foreign student whose mark > 85
    private void showForeignWellStudyingStudents(){
        view.students(service.getForeignWellStudyingStudents());
    }
}
