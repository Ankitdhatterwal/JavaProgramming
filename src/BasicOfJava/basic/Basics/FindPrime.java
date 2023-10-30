package BasicOfJava.basic.Basics;

import java.util.ArrayList;
import java.util.List;

public class FindPrime {
    public static List<Integer> findPrime(int n1, int n2){
        List<Integer> list = new ArrayList<>();
        for(int i =n1; i<=n2; i++){
            int cont=0;
            for (int j = 2; j <i/2; j++) {

                if(i%j==0){
                   cont =1;
                }
            }
            if(cont==0){
                list.add(i);
            }



        }

          return list;

    }
}
