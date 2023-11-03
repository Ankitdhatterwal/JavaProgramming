package Arrays;

import java.util.*;

public class FIrstNonRepeatingElement
{
    public static boolean firstNonRepeating(Integer arr[]){
        for(int i =0; i<arr.length; i++){
            int count =0;
            for(int j=0; j<arr.length; j++){
                if(arr[i]==arr[j])
                    count++;
                if(count ==2){
                    return true;
                }
            }
        }
        return false;


    }
}
