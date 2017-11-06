package com.firat.ops;

import java.lang.reflect.Array;
import java.util.*;

public class ListOps {
    private static ListOps instance = new ListOps();

    private ListOps()
    {

    }
    public <E> LinkedList<E> listToQueue(List<E> list)
    {
        return new LinkedList<E>(list);
    }

    public static ListOps getInstance() {
        return instance;
    }
}
