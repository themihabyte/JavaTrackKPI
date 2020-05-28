package m.novikov.io.github.themihabyte.view;

import m.novikov.io.github.themihabyte.exceptions.InvalidMenuItemException;
import m.novikov.io.github.themihabyte.model.Student;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

import java.util.Scanner;

public class View {
    private static final int WRONG_MENU_ITEM=-1;
    private static final Logger logger =LogManager.getLogger(View.class);
    Scanner scanner;

    public View() {
        this.scanner=new Scanner(System.in);
    }

    public int displayMenu() {
        int key;

        do {
            displayMenuItems();
            key=getMenuKey();
        } while (key == WRONG_MENU_ITEM);
        return key;
    }

    private int getMenuKey() {
        String key=scanner.nextLine();
        logger.info("Pressed key: " + key);

        try {
            Validator.validateMenuKey(key);
        } catch (InvalidMenuItemException e) {
            System.err.println(e.getMessage());
            logger.error(e.getMessage());
            return WRONG_MENU_ITEM;
        }
        return Integer.parseInt(key);
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

    public boolean askAboutSavingInFile() {
        System.out.println("Do you want to save this result into file?\n"+
                "y/n?");
        do {
            String key;
            key=scanner.nextLine();
            logger.info("Expected Yes/No key. Given: " + key);
            if (Validator.validateYesNoKey(key)) {
                return key.equals("Y") || key.equals("y") ||
                        key.equals("yes") || key.equals("YES");
            } else {
                System.out.println("Input another key");
                logger.warn("Asked to input another key");
            }
        } while (true);
    }

    public String getFilepath(){
        do {
            System.out.println("Where do you want to save it?");
            String filepath = scanner.nextLine();
            logger.info("given filepath: " + filepath);
            if (Validator.validateFilepath(filepath)) return filepath;
            else {
                System.err.println("Wrong filepath");
                logger.warn("Wrong filepath");
            }
        } while (true);
    }

    public void showErrorMessage(String message){
        System.err.println(message);
        logger.error(message);
    }

    public void showMessage(String message){
        System.out.println(message);
    }
}
