package Arrays;

public class RotateArray {
    public static int[] rotateArray(int[] arr){
        int n= arr.length-1;
        int last = arr[n];
        for (int i = n; i>0 ; i--) {
            arr[i] = arr[i-1];
        }

        arr[0]=last;
       return arr;

    }
}
