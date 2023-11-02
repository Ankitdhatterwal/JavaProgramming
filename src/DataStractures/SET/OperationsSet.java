package DataStractures.SET;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class OperationsSet {
public static void operations(int arr[]){
    TreeSet<Integer> set= new TreeSet<>();
    for (int n:arr) {
        set.add(n);

    }

    // we can't Access the data of the set directly so we need to convert it into the Array
    Integer[] elements=set.toArray(new Integer[set.size()]);

    System.out.println(elements[0]);
    }
}
