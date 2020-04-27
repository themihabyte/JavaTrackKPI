package m.novikov.io.github.themihabyte.view;

import java.util.List;
import java.util.Scanner;

public class View {
    Scanner scanner;

    public View() {
        this.scanner= new Scanner(System.in);
    }

    public void showList(List<Integer> list){
        System.out.println(list);
    }

    public int getNumberFromKeyboard(){
        System.out.print("Input number: ");
        String key = scanner.nextLine();
        return Integer.parseInt(key);
    }

    public void showMessage(String message){
        System.out.println(message);
    }
}
