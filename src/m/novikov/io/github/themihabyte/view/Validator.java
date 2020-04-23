package m.novikov.io.github.themihabyte.view;

import m.novikov.io.github.themihabyte.exceptions.InvalidMenuItemException;

class Validator {
    static void validateMenuKey(String key) throws InvalidMenuItemException {
        if (!key.matches("[1-4]")) {
            throw new InvalidMenuItemException("Menu item "+key+" does not exist");
        }
    }

    static boolean validateYesNoKey(String key) {
        return key.equals("Y") || key.equals("y") ||
                key.equals("yes") || key.equals("YES") ||
                key.equals("N") || key.equals("n") ||
                key.equals("no") || key.equals("NO");
    }

    static boolean validateFilepath(String filepath){
        return filepath.matches("([a-zA-Z]:(\\\\w+)*\\\\[a-zA-Z0_9]+)?.*");
    }
}
