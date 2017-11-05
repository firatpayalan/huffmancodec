package com.firat.ops;

import java.util.*;
import java.util.stream.Collectors;

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
    //for descending order->
    //.sorted(Map.Entry.comparingByValue(/*Collections.reverseOrder()*/))
    //type inference
    public <K, V extends Comparable<? super V>> Map<K, V> sortByValue(Map<K, V> map)
    {
        return map.entrySet().stream()
                .sorted(Map.Entry.comparingByValue())
                .collect(Collectors.toMap(
                        Map.Entry::getKey,
                        Map.Entry::getValue,
                        (k,v) -> k, LinkedHashMap::new
                ));

    }

    public static MapOps getInstance()
    {
        return instance;
    }
}
