package com.firat.ops;

import com.firat.Member;
import com.firat.Node;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Stack;

public class TreeOps {
    private static  TreeOps instance = new TreeOps();

    private TreeOps(){}

//    public <T> Node<T> constructHuffmanTree(HashMap<Character,Integer> sortedFrequencyMap)
//    {
//        Stack processingOrder = new Stack();
//        Iterator<Map.Entry<Character,Integer>> mapIterator =  sortedFrequencyMap.entrySet().iterator();
//        while (mapIterator.hasNext())
//        {
//            Map.Entry<Character,Integer> currentElement = mapIterator.next();
//            if (processingOrder.size()<2)
//            {
//                processingOrder.push(new Member(currentElement.getKey(),currentElement.getValue()));
//            }
//        }
//    }

    public static TreeOps getInstance() {
        return instance;
    }
}
