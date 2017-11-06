package com.firat;

import com.firat.ops.MapOps;
import com.firat.ops.StringOps;

import java.util.Map;

public class Decoder implements HuffmanDecoder{


    @Override
    public String encode(String raw) {
        StringOps stringOps = new StringOps();
        Map<Character,Integer> frequencyMap = stringOps.findFrequencies(raw);
        frequencyMap = MapOps.getInstance().sortByValue(frequencyMap); //sorted frequency map

        return null;
    }

    @Override
    public <T> String decode(String encoded, Node<T> node) {
        return null;
    }
}
