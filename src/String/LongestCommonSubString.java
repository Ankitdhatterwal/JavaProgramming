package String;

import java.util.Arrays;

public class LongestCommonSubString {
    public static String longestCommonSubString(String[] str){
 if(str.length ==0){
     return " ";
 }if(str.length ==1)
        {
            return str[0];
        }
        Arrays.sort(str);
 int end = Math.min(str[0].length(), str[str.length-1].length());
 int i=0;
 while(i<end && str[0].charAt(i) == str[str.length-1].charAt(i)){
     i++;
 }
 return str[0].substring(0,i);




    }
}
