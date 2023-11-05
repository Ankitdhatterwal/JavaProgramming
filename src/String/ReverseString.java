package String;

public class ReverseString {

    public static String reverseString(String str){
        char arr[] = str.toCharArray();
        int n  =arr.length-1;
        int i=0;
        while(i<n){
            char temp = arr[i];
            arr[i] = arr[n];
            arr[n] = temp;
            n--;
            i++;
        }

       String str2  = new String(arr);

return str2;



    }
}
