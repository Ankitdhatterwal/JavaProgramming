package BasicOfJava.basic.Basics;


import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       Scanner scan = new Scanner(System.in);


        //** program to get fibonacci series
//        System.out.println("enter the length of fibonacci series : ");
//            int n = scan.nextInt();
//            Fibonacci fib = new Fibonacci();
//            List<Integer> list = fib.fibonacci(n);
//        System.out.println(list);
//    }


        //** program To find the prime number between a range
//        System.out.println("Enter the start number :");
//        int n1 = scan.nextInt();
//        System.out.println("Enter the second number :");
//        int n2  = scan.nextInt();
//        FindPrime findPrime =new FindPrime();
//
//        List<Integer>list = findPrime.findPrime(n1,n2);
//        System.out.println(list);

        //** program to find the devident of any given number
//        System.out.println("Enter the number to check : ");
//        int n = scan.nextInt();
//        checkDevidents devidents = new checkDevidents();
//       List<Integer> list =new ArrayList<>();
//       list=  devidents.checkD(n);
//        System.out.println(list);

// program to print patten

        Pattern pattern  = new Pattern();
        pattern.patter(8);

}}
