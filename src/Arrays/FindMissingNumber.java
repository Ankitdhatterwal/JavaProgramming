package Arrays;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class FindMissingNumber {
    public static int missingNumber(List<Integer> list){
        List<Integer> list1 = new ArrayList<>();
        int size = list.size();
        for (int i =1; i <= size+1 ; i++) {
            list1.add(i);
        }
        for(int i = 0; i < size; i++) {
            list1.remove(list.get(i));
        }

        return list1.get(0);





    }
}
