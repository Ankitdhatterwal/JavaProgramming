package Arrays;

import java.util.Arrays;

public class ValidAnagram {
public static void validAnagram(String s,String t){
    char a[] =s.toCharArray();
    char b[] = t.toCharArray();
    Arrays.sort(a);
    Arrays.sort(b);
    if(Arrays.equals(a,b)){
        System.out.println("valid");
    }
    else {
        System.out.println("no valid");
    }


}
}

