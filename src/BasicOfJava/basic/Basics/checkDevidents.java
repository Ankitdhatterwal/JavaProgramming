package BasicOfJava.basic.Basics;

import java.util.ArrayList;
import java.util.List;

public class checkDevidents
{
    public static List<Integer> checkD(int n){
        List<Integer> list = new ArrayList<>();
        for (int i = 2; i <n/2 ; i++) {
            if(n%i==0){
                list.add(i);

            }

        }

        return list;


    }
}
