package Arrays;

import java.util.ArrayList;

public class InterSectionOfArray {
    public static void interSection(int arr[],int arr1[]){
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i <arr.length ; i++) {

            for (int j = 0; j <arr1.length; j++) {
                if(arr[i]==arr1[j]){
                    list.add(arr[i]);
                }

            }
        }
        for (int ar:list) {
            System.out.print(ar+" ");
        }

    }


}
