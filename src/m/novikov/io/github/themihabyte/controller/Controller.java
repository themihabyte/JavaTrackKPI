package m.novikov.io.github.themihabyte.controller;

import m.novikov.io.github.themihabyte.model.Service;
import m.novikov.io.github.themihabyte.view.View;

import java.util.List;

public class Controller {
    private final Service service;
    private final View view;

    public Controller() {
        this.service=new Service();
        this.view=new View();
    }

    public void run(){
        view.showMessage("Initialize this list:");
        view.showList(service.getList());
        for (int i=0; i < 10; i++) {
            service.addToList(view.getNumberFromKeyboard());
        }

        List<List<Integer>> lists = service.divideListByTwo(service.getList());
        view.showMessage("Now the list is devided into two other");
        view.showList(lists.get(0));
        view.showList(lists.get(1));

        service.sortDescending(lists.get(0));
        service.sortDescending(lists.get(1));
        view.showMessage("Now these lists are sorted");
        view.showList(service.sortDescending(lists.get(0)));
        view.showList(service.sortDescending(lists.get(1)));
    }
}
