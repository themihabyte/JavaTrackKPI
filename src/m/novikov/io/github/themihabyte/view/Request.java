package m.novikov.io.github.themihabyte.view;

import java.util.Scanner;

public class Request {
    Scanner scanner; // For getting keys from keyboard

    // Reads key written in console
    int getMenuKey() {
        int key;
        try {
            key=scanner.nextInt(); // Read key from console
        } catch (Exception e){
            System.out.println("Input another key");
            scanner = new Scanner(System.in);
            return -1;
        }
        if (Validator.validateMenuKey(key)) return key; // Check is the key corresponds to the menu items
        return -1; // Error code (key isn`t corresponds to menu items)
    }

    Request() {
        this.scanner=new Scanner(System.in);
    }
}
