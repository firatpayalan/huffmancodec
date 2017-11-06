package com.firat;
/**
 * a leaf member of huffman tree.
 */
public class Member {
    private char value;
    private int frequency;

    public Member(char value,int frequency)
    {
        this.value=value;
        this.frequency=frequency;
    }

    /**
     * non-real leaf member is used for internal nodes.
     * @param frequency sum of two real leaf member.
     */
    public Member(int frequency)
    {
        this.value='#';
        this.frequency=frequency;
    }

    public char getValue() {
        return value;
    }

    public void setValue(char value) {
        this.value = value;
    }

    public int getFrequency() {
        return frequency;
    }

    public void setFrequency(int frequency) {
        this.frequency = frequency;
    }
}
