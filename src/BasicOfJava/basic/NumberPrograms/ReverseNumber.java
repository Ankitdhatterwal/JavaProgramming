package BasicOfJava.basic.NumberPrograms;

import java.util.ArrayList;
import java.util.List;

public class ReverseNumber
{
    public static int Reversenumber(int n){
        int reverse =0;
        while(n>0){
            int n1 = n%10;
            reverse = reverse*10+n1;
             n =n/10;
        }
        return reverse;




    }
}
