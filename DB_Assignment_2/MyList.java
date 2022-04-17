package HW2;

import java.util.*;

public class MyList<T> {
    List<T> genericList;

    public MyList(int dimension) {
        genericList = new ArrayList<>(dimension);
    }

    public void add(T element) {
        this.genericList.add(element);
    }

    public void print() {
        System.out.print("List: [");
        for (T t : genericList)
            System.out.print(t + ", ");
        System.out.println("\b\b]");
    }

    public boolean lookup(T element) {
        return genericList.contains(element);
    }
}