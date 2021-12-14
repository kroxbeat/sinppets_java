package designPattern.iterator;

import java.util.ArrayList;
import java.util.List;

public class ArrContainer<T>{

    List<T> list;

    public ArrContainer() {
        this.list = new ArrayList<T>();
    }

    public void add(T t) {
        this.list.add(t);
    }

    public ArrIterator<T> getIterator() {
        return new ArrIterator<T>(this);
    }
}
