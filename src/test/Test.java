import com.firat.observer.StackObservable;
import com.firat.observer.StackObserver;

import java.util.Map;
import java.util.Stack;
import java.util.TreeMap;

public class Test {

    @org.junit.Test
    public void testStackObserver()
    {
        Stack stack = new Stack();
        StackObservable observable = new StackObservable(stack);
        StackObserver observer = new StackObserver(stack);
        observable.addObserver(observer);

        stack.push(new Object());
        observable.setStack(stack);

        stack.push(new Object());
        observable.setStack(stack);

        stack.push(new Object());
        observable.setStack(stack);

    }
    @org.junit.Test
    public void treeMapExample()
    {
        TreeMap<String, Double> treeMap=new TreeMap<>();

        treeMap.put("Paradise Lost", 23.56);
        treeMap.put("Golden Treasury", 12.47);
        treeMap.put("Moon and the Sixpence", 65.28);
        treeMap.put("Holinshed", 7.68);
        treeMap.put("Ancient Mariner", 45.36);

        printAll(treeMap);

        // Keys cannot be duplicates. This will not be stored.
        treeMap.put("Paradise Lost", 23.56);
        printAll(treeMap);

        // Values may be duplicates. This will be stored.
        treeMap.put("Paradise Regained", 23.56);
        printAll(treeMap);

    }
    public static void printAll(TreeMap<String, Double> treeMap){
        for(Map.Entry<String, Double> et:treeMap.entrySet()){
            System.out.println(et.getKey()+": "+et.getValue());
        }
        System.out.println();
    }


}
