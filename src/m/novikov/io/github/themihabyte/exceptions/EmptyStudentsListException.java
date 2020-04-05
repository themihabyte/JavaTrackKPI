package m.novikov.io.github.themihabyte.exceptions;

public class EmptyStudentsListException extends Exception{
    @Override
    public String getMessage() {
        return "There are not any students like that";
    }
}
