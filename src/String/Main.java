package String;

import java.util.Scanner;

public class Main extends LongestCommonSubString {
    public static void main(String[] args) {
        Scanner scan  = new Scanner(System.in);
        String str  =scan.nextLine();
//        String revstr = reverseString(str);
//        System.out.println(revstr);
//** program to find Reverse words on sigle string
//        for (String str1:ReverseWord(str)){
//            System.out.print(str1+" ");
//        }

        //** program to find the longestCommonSubString
String str1[] = {"ankit","ankti","ank"};
        System.out.print(longestCommonSubString(str1));


    }
}
