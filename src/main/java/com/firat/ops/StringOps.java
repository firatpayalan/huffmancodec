package com.firat.ops;

import java.util.HashMap;

public class StringOps {
    public HashMap<Character,Integer> findFrequencies(String text)
    {
        HashMap<Character,Integer> frequenciesMap = new HashMap<>();

        char[] array = text.toCharArray();
        for (char currentChar:array)
        {
            //new character
            if (frequenciesMap.get(currentChar) == null)
                frequenciesMap.put(currentChar,1);
            //locates and increment by one
            else
            {
                Integer currentValue = frequenciesMap.get(currentChar).intValue();
                currentValue = currentValue+1;
                frequenciesMap.put(currentChar,currentValue);
            }
        }
        MapOps.getInstance().printKeyVal(frequenciesMap);
        return frequenciesMap;
    }

    public static void main(String[] args) {
        new StringOps().findFrequencies("comolokko");
    }
}
