package BasicOfJava.basic.Basics;

import java.util.ArrayList;
import java.util.List;

public class Fibonacci
{
    public static List<Integer> fibonacci(int n){
        List<Integer> list = new ArrayList<>();
        list.add(0);
        list.add(1);
        list.add(1);
int next;
        for (int i = 2; i <n; i++) {
           next = list.get(list.size()-1)+list.get(list.size()-2);
            list.add(next);
        }
return list;
    }
}
