package m.novikov.io.github.themihabyte.view;

import m.novikov.io.github.themihabyte.model.Student;

import java.util.Scanner;

public class View {
    Scanner scanner;

    public View(){
        this.scanner = new Scanner(System.in);
    }

    public int menu(){
        int key;

        do {
            displayMenuItems();
            key = getMenuKey();
        } while (key == -1);
        return key;
    }

    public void students(Student[] students){
        displayStudents(students);
    }

    private int getMenuKey() {
        int key;

        try {
            key=scanner.nextInt();
        } catch (Exception e){
            System.out.println("Input another key");
            scanner = new Scanner(System.in);
            return -1;
        }
        if (Validator.validateMenuKey(key)) return key;
        return -1;
    }

    private void displayMenuItems(){
        System.out.println("\t\tMENU\n");
        System.out.println("1) Show students list");
        System.out.println("2) Show excellent second-year students");
        System.out.println("3) Show foreign well-studying students");
        System.out.println("4) Exit");
        System.out.println("Enter key: ");
    }

    private void displayStudents(Student[] students){
        if (students == null) {
            System.out.println("There aren`t any students like that");
            return;
        }

        for (Student student:
                students) {
            System.out.println(student.toString());
        }
    }
}
