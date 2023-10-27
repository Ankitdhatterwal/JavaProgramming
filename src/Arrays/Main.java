package Arrays;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("length of the array : ");
        int n = scan.nextInt();
        int arr[] = new int[n];
        for(int i=0 ; i<n; i++ ){
            arr[i] = scan.nextInt();
        }
//       ** program for find the largest element is orderd array ASC/DSC both ** (code for MaxElementArray)
//        int arr[] ={8,7,6,5,3};
//   MaxElementArray max = new MaxElementArray();
//    int s = max.max1(arr);
//        if(s ==1){
//            System.out.println("Largest element is: "+arr[0]);
//        }else{
//            System.out.println("Largest element is: "+arr[4]);
//        }

// ** program to reverse a string **// name ~ ReverseArray
//        ReverseArray rsv = new ReverseArray();
//        int rsvarray[] = rsv.reverse(arr);
//        for(int rs:rsvarray){
//            System.out.print(rs+" ");
//        }

        //**
    }

}
