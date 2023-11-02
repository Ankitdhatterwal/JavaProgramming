package DataStractures.MAP;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class OprationsMap {
    public static void map(int arr[]){
        Map map= new HashMap();
        map.put("Ankit",12.21);
        map.put(123,"shyam");

        map.put(123,"shyam");

        map.remove(123);
 Object  f =  map.get("Ankit");
        System.out.println(f);


        System.out.println(map);
    }
}
