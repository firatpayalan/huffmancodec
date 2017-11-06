package com.firat;

public interface HuffmanDecoder {
    public String encode(String raw);
    public <T> String decode(String encoded,Node<T> node);
}
