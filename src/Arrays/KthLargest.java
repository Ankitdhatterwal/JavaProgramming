package Arrays;

import java.util.Arrays;

public class KthLargest {
    public static int kthLargestElement(int[] arr,int k){
        Arrays.sort(arr);
        int n = arr.length;
        int largest = arr[n-k];
        return largest;
    }
}
