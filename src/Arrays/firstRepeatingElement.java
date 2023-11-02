package Arrays;

import java.util.ArrayList;
import java.util.List;

public class firstRepeatingElement {
    public static int contain(int arr[]){
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i <arr.length ; i++) {
        if(list.contains(arr[i])){
            return arr[i];
        }
         list.add(arr[i]);

        }
        return -1;

    }
}
