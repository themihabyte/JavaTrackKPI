package m.novikov.io.github.themihabyte.view;

import m.novikov.io.github.themihabyte.model.Student;

import java.util.Scanner;

public class View {
    private static final int WRONG_MENU_ITEM=-1;
    Scanner scanner;

    public View() {
        this.scanner=new Scanner(System.in);
    }

    public int menu() {
        int key;

        do {
            displayMenuItems();
            key=getMenuKey();
        } while (key == WRONG_MENU_ITEM);
        return key;
    }

    private int getMenuKey() {
        String key;
        key=scanner.nextLine();

        if (Validator.validateMenuKey(key)) {
            return Integer.parseInt(key);
        } else {
            System.out.println("Input another key");
            return WRONG_MENU_ITEM;
        }
    }

    private void displayMenuItems() {
        System.out.println("\t\tMENU\n");
        System.out.println("1) Show students list");
        System.out.println("2) Show excellent second-year students");
        System.out.println("3) Show foreign well-studying students");
        System.out.println("4) Exit");
        System.out.println("Enter key: ");
    }

    public void displayStudents(Student[] students) {
        if (students.length == 0) {
            System.out.println("There are not any students like that");
            return;
        }

        System.out.println("NAME\tSURNAME\tLAST NAME\tID\tSTUDY YEAR\t"+
                "COUNTRY\tGENDER\tMARK\n");
        for (Student student :
                students) {
            System.out.println(student.toString());
        }
    }
}
