package String;

public class ReverseWord
{
  public static  String[] ReverseWord(String str1){
      String[] str  = str1.split(" ");
      int n = str.length-1;
      int i =0;
      while(i<n){
          String temp = str[i];
          str[i] = str[n];
          str[n] =temp;
          n--;
          i++;
      }

      return str;


    }
}
