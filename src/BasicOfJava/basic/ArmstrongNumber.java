package BasicOfJava.basic;

import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String args[]) {
        Scanner scan  = new Scanner(System.in);
        System.out.println("Enter the number :");
        int n =scan.nextInt();
        int n2 = n;
        int sum =0;
        while(n>0){
            int n1= n%10;
            sum = sum+(n1*n1*n1);
            n = n/10;

        }
        if(sum == n2){
            System.out.println("Armstrong ");
        }
        else{
            System.out.println("not Armstrong");
        }
    }

    }
