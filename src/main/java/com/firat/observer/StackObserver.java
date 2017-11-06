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
        int stackSize = ((StackObservable) o).getStack().size();
        if (stackSize==2)
        {


        }
        System.out.println(((StackObservable) o).getStack().size());
    }
}
