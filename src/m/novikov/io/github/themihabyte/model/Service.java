package m.novikov.io.github.themihabyte.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Service {
    private List<Integer> list;

    public Service() {
        this.list=new ArrayList<>();
    }

    public List<List<Integer>> divideListByTwo(List<Integer> list){
        int zeroIndex = list.indexOf(0);

        return Arrays.asList(list.subList(0, zeroIndex),
                list.subList(zeroIndex+1, list.size())); // TODO
    }

    public List<Integer> getList() {
        return list;
    }

    public void addToList(int num) {
        list.add(num);
    }

    public List<Integer> sortDescending(List<Integer> list){
        list.sort(Collections.reverseOrder());
        return list;
    }
}
