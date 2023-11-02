package Arrays;

import java.util.*;

public class FindDuplicate {
    public static List<Integer> duplicate(int arr[]) {
        TreeSet<Integer> set = new TreeSet<>();
        Map map=new HashMap();
        for (int ar : arr) {
            set.add(ar);
        }
        Integer arr1[] = set.toArray(new Integer[set.size()]);
        for (int i = 0; i <arr1.length ; i++) {
            int count=0;
            for (int j = 0; j <arr.length ; j++) {
                if(arr1[i]==arr[j]){
                    count++;
                }
                if(count>1)
                map.put(arr1[i],count);

            }

        }
        System.out.println(map);
        Set<Integer> set1 = new HashSet<>();
        set1 =  map.keySet();
        System.out.println(set1);

        return null;
    }
}
