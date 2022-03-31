package utility;

import lombok.experimental.Delegate;

import java.util.*;

public class DelegateList<E> implements List<E> {

    @Override
    public boolean remove(Object o) {
        System.out.println("I am removing!!!");
        return base.remove(o);
    }

    private interface Remove{
        boolean remove(Object o);
    }

    @Delegate(excludes = Remove.class)
    private List<E> base = new ArrayList<>();

}
