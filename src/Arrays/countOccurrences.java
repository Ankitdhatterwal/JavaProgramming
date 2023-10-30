package Arrays;

public class countOccurrences {
    public static int countOccurrences(int arr[],int k){
       int n = arr.length;
       int count =0;
        for (int i = 0; i <= n-1; i++) {
            if(arr[i]==k){
                count++;
            }
        }
        return count;
    }
}
