package m.novikov.io.github.themihabyte.view;

import m.novikov.io.github.themihabyte.model.Student;

public class View {
    Request request;
    Response response;

    public View(){
        this.request = new Request();
        this.response = new Response();
    }

    public int menu(){
        int key;
        do {
            response.displayMenuItems();
            key = request.getMenuKey();
        } while (key == -1);
        return key;
    }

    public void students(Student[] students){
        response.displayStudents(students);
    }
}
