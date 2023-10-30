package DataStractures.LIst;

import java.util.List;
import java.util.Scanner;

public class Operations {
    public static List<String> operation(List<String> list){
        //add Operation
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        list.add(str);
        list.add(1,"Friends");
        list.add("Ankit");
        list.add("Ankit");
list.clear();
boolean i = list.isEmpty();
if(list.isEmpty()){
    System.out.println("List is empty : ");
}
        //remove Operation

     list.removeIf(a->a.equalsIgnoreCase("Ankit"));

         //   list.clear();
        //Add element in middle
        //remove element in middle




        // iterate through list
       // System.out.println(list);
       // String ar = list.get(2);
     //   System.out.println(ar);
//        int size = list.size();
//        System.out.println("size: "+size);
Object[] str1 = list.toArray();
 int n1 = str1.length;
        System.out.println(n1);
        for (Object str2:str1) {
            System.out.println(str2);

        }

return list;
    }
}
