package DataStractures.LIst;

import java.util.*;

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
boolean j = list.isEmpty();
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
 //** program to conver list to array of int type
List<Integer> list1 = new ArrayList<>();
        Collections.addAll(list1,1,2,3,4,5,6);
        int arr[]  = list1.stream().mapToInt(i->i).toArray();

        System.out.println(list1);



return list;
    }
}
