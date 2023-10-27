package Arrays;
public class ReverseArray
{
  public  static int[] reverse(int arr[]){

        int first = 0;
        int last =arr.length-1;
        while(first<last){
            int temp =arr[first];
            arr[first] = arr[last];
            arr[last] = temp;
            first++;
            last--;
        }
        return arr;
    }
}
