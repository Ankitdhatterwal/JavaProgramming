package String;

import java.util.Scanner;

public class Main extends ReverseString {
    public static void main(String[] args) {
        Scanner scan  = new Scanner(System.in);
        String str  =scan.nextLine();
        String revstr = reverseString(str);
        System.out.println(revstr);
    }
}
