package com.firat.ops;

import com.firat.HuffmanEntry;
import com.firat.Member;
import com.firat.Node;
import com.firat.observer.StackObservable;
import com.firat.observer.StackObserver;

import java.util.*;

public class TreeOps {
    private static  TreeOps instance = new TreeOps();

    private TreeOps(){}

//    public <T> Node<T> constructHuffmanTree(HashMap<Character,Integer> sortedFrequencyMap)
//    {
//        List<Member> memberList= (List<Member>)(List<?>)MapOps.getInstance().convertToList(sortedFrequencyMap);
//        //linkedlist acts as a queue type.
//        LinkedList<Member> orderedList = ListOps.getInstance().listToQueue(memberList);
//        int num=0;
//        Member lastMember=null;
//        Node<Member> child1=null;
//        while (orderedList.size()>0)
//        {
//            Member currentMember = orderedList.getFirst();
//
//            if (lastMember!=null)
//            {
//                if (currentMember.getFrequency()>=lastMember.getFrequency())
//                {
//                    Node<Member> child2 = new Node<Member>(lastMember);
//                    //set new parent.
//                    Node<Member>parent = new Node<Member>(new Member('#',currentMember.getValue()+lastMember.getValue()));
//                    parent.addChild(child1);
//                    parent.addChild(child2);
//                    orderedList.removeFirst();
//                    orderedList.removeFirst();
////                    orderedList.addFirst(new Member('#',currentMember.getValue()+lastMember.getValue()));
//                    currentMember = new Member('#',currentMember.getValue()+lastMember.getValue());
//
//                }
//            }
//
//            child1 = new Node<Member>(currentMember);
//            lastMember = currentMember;
//
//        }
//
//
//    }


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
//        Node<Member> child1=null;
//        while (mapIterator.hasNext())
//        {
////            Map.Entry<Character,Integer> currentElement = mapIterator.next();
//            HuffmanEntry<Character,Integer> currentElement = (HuffmanEntry<Character, Integer>) mapIterator.next();
//            if (lastElement!=null)
//            {
//                if (currentElement.getValue() >= lastElement.getValue())
//                {
//                    Node<Member> child2 = new Node<Member>(new Member(lastElement.getKey(),lastElement.getValue()));
//                    //set new parent.
//                    Node<Member>parent = new Node<Member>(new Member(currentElement.getValue()+lastElement.getValue()));
//                    parent.addChild(child1);
//                    parent.addChild(child2);
//                    HuffmanEntry<Character,Integer> parentAsChild = new HuffmanEntry<Character, Integer>('#',parent.getData().getFrequency());
//                    currentElement=parentAsChild;
//                }
////                else
////                {
////                    child1 = new Node<Member>(new Member(currentElement.getKey(),currentElement.getValue()));
////                }
//            }
//            //new kid
//            child1 = new Node<Member>(new Member(currentElement.getKey(),currentElement.getValue()));
//            lastElement = currentElement;
//        }
//    }


    public static TreeOps getInstance() {
        return instance;
    }
}
