package Arrays;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Use {
    public static void print(int arr[]){
     for(int a:arr){
         System.out.print(a+" ");
     }}
    public static int[] read(){
            Scanner scan  =new Scanner(System.in);
            System.out.println("length : ");
            int n = scan.nextInt();
            int arr[] = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = scan.nextInt();
            }
            return arr;



    }

}
