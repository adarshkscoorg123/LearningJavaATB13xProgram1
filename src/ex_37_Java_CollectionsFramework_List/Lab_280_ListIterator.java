package ex_37_Java_CollectionsFramework_List;

import java.util.ArrayList;
import java.util.ListIterator;

public class Lab_280_ListIterator {

    public static void main(String[] args) {

        ArrayList<String> arrayList = new ArrayList<String>();
        arrayList.add("Item1");
        arrayList.add("Item2");
        arrayList.add("Item3");
        arrayList.add("Item4");
        System.out.println(arrayList);

        // List Iterator can be used only in List
        // It cannot be used in Set, Queue and Map
        ListIterator list = arrayList.listIterator();
        while(list.hasNext()){
            System.out.println(list.next());
        }

        System.out.println("-----------");

        while(list.hasPrevious()){
            System.out.println(list.previous());
        }
        System.out.println(arrayList);
    }
}
