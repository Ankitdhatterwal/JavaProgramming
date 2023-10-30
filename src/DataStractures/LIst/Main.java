package DataStractures.LIst;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        List<String> list = new ArrayList(Arrays.asList("Ankit","dhatterwal","poonam","payal","datterwal"));


//** function is used to  test the oprations
   //     Operations op =new Operations();
//   op.operation(list);

        //** function used to add an element at given index
        AddElementToSpecifiedIndexArrayListExample addIndex = new AddElementToSpecifiedIndexArrayListExample();
        List<String> list2 = addIndex.addAtIndex(list,"hello",2);
        System.out.println(list2);



    }
}
