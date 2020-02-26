package m.novikov.io.github.themihabyte.view;

import m.novikov.io.github.themihabyte.model.Student;

public class Response {
    void displayMenuItems(){
        System.out.println("\t\tMENU\n");
        System.out.println("1) Show students list");
        System.out.println("2) Show excellent second-year students");
        System.out.println("3) Show foreign well-studying students");
        System.out.println("4) Exit");
        System.out.println("/nEnter key: ");
    }

    void displayStudents(Student[] students){
        for (Student student:
             students) {
            System.out.println(student.toString());
        }
    }
}
