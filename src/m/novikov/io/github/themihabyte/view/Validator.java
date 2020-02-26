package m.novikov.io.github.themihabyte.view;

public class Validator {
    static boolean validateMenuKey(int key) {
        if (key > 4 || key < 1) {
            System.out.println("Input Another key");
            return false;
        }
        return true;
    }
}
