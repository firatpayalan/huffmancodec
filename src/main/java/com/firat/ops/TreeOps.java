package com.firat.ops;

import com.firat.Member;
import com.firat.Node;
import com.firat.observer.StackObservable;
import com.firat.observer.StackObserver;

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
//        //register stack observers
//        StackObservable observable = new StackObservable(processingOrder);
//        StackObserver observer = new StackObserver(processingOrder);
//        observable.addObserver(observer);
//        //end of registration
//        Iterator<Map.Entry<Character,Integer>> mapIterator =  sortedFrequencyMap.entrySet().iterator();
//        Map.Entry<Character,Integer> lastElement=null;
//        while (mapIterator.hasNext())
//        {
//            Map.Entry<Character,Integer> currentElement = mapIterator.next();
//            if (lastElement!=null)
//            {
//                if (currentElement.getValue() >= lastElement.getValue())
//                {
//                    if (processingOrder.size()<2)
//                    {
//                        processingOrder.push(new Member(currentElement.getKey(),currentElement.getValue()));
//                        observable.setStack(processingOrder);
//                    }
//                }
//            }
//            lastElement = currentElement;
//        }
//    }

    public static TreeOps getInstance() {
        return instance;
    }
}
