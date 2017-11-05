package com.firat.ops;

import java.util.Collections;
import java.util.HashMap;

public class HashOps {
    //meet the singleton
    private static HashOps instance = new HashOps();
    //prevents initializing
    private HashOps() {}

    public void printKeyVal(HashMap<?,?> map )
    {
        if (map.size()>0)
            System.out.println(Collections.singletonList(map));
        else
            System.out.println("EMPTY MAP !!!!");
    }

    public static HashOps getInstance()
    {
        return instance;
    }
}
