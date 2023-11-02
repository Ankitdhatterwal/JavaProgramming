package BasicOfJava.basic.Basics;
import java.util.Scanner;
public class Largestnumber {
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        int arr[] = new int[100];
        System.out.println("length of the array : ");
       int n = scan.nextInt();
       for(int i=0 ; i<n; i++ ){
            arr[i] = scan.nextInt();
        }
        Largestnumber.largest(n,arr);
        smallest(n,arr);
    }
    private static void largest(int n, int[] arr) {
        int largest =arr[0];
        for(int i =0; i<n; i++){
            if(largest < arr[i]){
                largest = arr[i];
            }}
        System.out.println(largest);

    }
    private static void smallest(int n, int[] arr) {
        int smallest =arr[0];
        for(int i =0; i<n; i++){
            if(smallest > arr[i]){
                smallest = arr[i];
            }
        }
        System.out.println(smallest);
    }

}
