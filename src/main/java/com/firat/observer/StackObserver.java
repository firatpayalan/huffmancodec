package com.firat.observer;

import java.util.Observable;
import java.util.Observer;
import java.util.Stack;

public class StackObserver implements Observer {
    private Stack stack =null;
    public StackObserver(Stack stack)
    {
        this.stack=stack;
    }


    @Override
    public void update(Observable o, Object arg) {
        System.out.println(((StackObservable) o).getStack().size());
    }
}
