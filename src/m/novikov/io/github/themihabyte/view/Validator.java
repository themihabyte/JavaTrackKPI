package m.novikov.io.github.themihabyte.view;

class Validator {
    static boolean validateMenuKey(String key) {
        return key.matches("[1-4]");
    }
}
