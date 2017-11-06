package com.firat.observer;

import java.util.Observable;
import java.util.Stack;

public class StackObservable extends Observable {
    private Stack stack;
    public StackObservable(Stack stack)
    {
        this.stack=stack;
    }

    public Stack getStack() {
        return stack;
    }

    public void setStack(Stack stack) {
        this.stack = stack;
        setChanged();
        notifyObservers();
    }
}
