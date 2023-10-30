package Arrays;

import java.util.ArrayList;
import java.util.TreeSet;

public class UnionOfArray
{
    public static void union(int arr[],int arr1[]){
        TreeSet<Integer> set =new TreeSet<>();
        for (int ar:arr) {
            set.add(ar);
        }
        for (int ar:arr1) {
            set.add(ar);
        }
        for (int are:set) {
            System.out.print(are+" ");
        }
    }
}
