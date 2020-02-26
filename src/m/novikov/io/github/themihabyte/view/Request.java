package m.novikov.io.github.themihabyte.view;

import java.util.Scanner;

public class Request {
    Scanner scanner;

    int getMenuKey() {
        int key=scanner.nextInt();
        if (Validator.validateMenuKey(key)) return key;
        return -1;
    }

    Request() {
        this.scanner=new Scanner(System.in);
    }
}
