import com.firat.Member;
import com.firat.observer.StackObservable;
import com.firat.observer.StackObserver;
import com.firat.ops.ListOps;
import com.firat.ops.MapOps;
import com.firat.ops.StringOps;

import java.util.*;

import static com.firat.ops.MapOps.getInstance;

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

    @org.junit.Test
    public void mapToListToLinkedList()
    {
        String text = "comolokko";
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
        getInstance().printKeyVal(frequenciesMap);
        frequenciesMap = (HashMap<Character, Integer>) getInstance().sortByValue(frequenciesMap);
        List<Member> memberList= (List<Member>)(List<?>)MapOps.getInstance().convertToList(frequenciesMap);
        ListOps.getInstance().listToQueue(memberList);
        System.out.println();
    }
    public static void printAll(TreeMap<String, Double> treeMap){
        for(Map.Entry<String, Double> et:treeMap.entrySet()){
            System.out.println(et.getKey()+": "+et.getValue());
        }
        System.out.println();
    }


}
