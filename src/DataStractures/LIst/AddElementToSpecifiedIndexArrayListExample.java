package DataStractures.LIst;

import java.util.List;

public class AddElementToSpecifiedIndexArrayListExample
{
    public static List<String> addAtIndex(List<String> list,String element,int index){
        list.add(index,element);
        return list;

    }
}
