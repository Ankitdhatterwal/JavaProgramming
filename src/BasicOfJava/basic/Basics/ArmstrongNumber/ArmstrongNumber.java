package BasicOfJava.basic.Basics.ArmstrongNumber;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String args[]) {
        List<Integer> list  =new ArrayList<>();
        Scanner scan  = new Scanner(System.in);
        System.out.println("Enter the  first number :");

        int start =scan.nextInt();
        System.out.println("Enter the second number:");
        int end = scan.nextInt();
        for (int n = start; n <end ; n++) {

                int n1=0;
               int n2 =n;
            int sum = 0;
            while (n2 > 0) {
                 n1 = n2 % 10;
                sum = sum + (n1 * n1 * n1);
                n2 = n2/ 10;

            }
            if (sum == n) {
                list.add(n);
            }
        }
        System.out.println(list);
    }

    }
