package BasicOfJava.basic.NumberPrograms;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Enter the numer to reverse");
        Scanner scan = new Scanner(System.in);
        int n1 = scan.nextInt();

        ReverseNumber rs =new ReverseNumber();
        int n=  rs.Reversenumber(n1);
        System.out.println(n);
    }
}
