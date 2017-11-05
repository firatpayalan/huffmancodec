package com.firat.ops;

import java.util.Collections;
import java.util.HashMap;

public class MapOps {
    //meet the singleton
    private static MapOps instance = new MapOps();
    //prevents initializing
    private MapOps() {}

    public void printKeyVal(HashMap<?,?> map )
    {
        if (map.size()>0)
            System.out.println(Collections.singletonList(map));
        else
            System.out.println("EMPTY MAP !!!!");
    }

    public static MapOps getInstance()
    {
        return instance;
    }
}
