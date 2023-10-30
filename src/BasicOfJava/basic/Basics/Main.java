package BasicOfJava.basic.Basics;


import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       Scanner scan = new Scanner(System.in);


        //** program to get fibonacci series
        System.out.println("enter the length of fibonacci series : ");
            int n = scan.nextInt();
            Fibonacci fib = new Fibonacci();
            List<Integer> list = fib.fibonacci(n);
        System.out.println(list);
    }
}
