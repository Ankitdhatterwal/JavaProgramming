package Arrays;

import java.util.ArrayList;
import java.util.List;

public class InterSectionOfArray {
    public static List<Integer> interSection(int[] arr, int[] arr1){
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i <arr.length ; i++) {

            for (int j = 0; j <arr1.length; j++) {
                if(arr[i]==arr1[j]){
                    list.add(arr[i]);
                }

            }
        }
        return list;

    }


}
