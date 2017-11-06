import com.firat.observer.StackObservable;
import com.firat.observer.StackObserver;

import java.util.Stack;

public class Test {

    @org.junit.Test
    public void testStackObserver()
    {
        Stack stack = new Stack();
        StackObservable observable = new StackObservable(stack);
        StackObserver observer = new StackObserver(stack);
        observable.addObserver(observer);

        stack.push(new Object());
        stack.push(new Object());
        stack.push(new Object());
        observable.setStack(stack);


    }


}
