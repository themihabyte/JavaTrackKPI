package m.novikov.io.github.themihabyte.view;

import m.novikov.io.github.themihabyte.exceptions.InvalidMenuItemException;

class Validator {
    static void validateMenuKey(String key) throws InvalidMenuItemException {
        if (!key.matches("[1-4]")){
            throw new InvalidMenuItemException();
        }
    }
}
