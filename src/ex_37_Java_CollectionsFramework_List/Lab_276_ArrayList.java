package ex_37_Java_CollectionsFramework_List;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Lab_276_ArrayList {

    public static void main(String[] args) {

        ArrayList arraylist = new ArrayList<>();
        arraylist.add("Pramod");
        arraylist.add(null); // Null is allowed in ArrayList
        arraylist.add("Dutta");
        arraylist.add("Dutta"); // duplicates are allowed in Arraylist
        arraylist.add(123);
        arraylist.add(123); // different data is also allowed unless generics is not used
        arraylist.add(true);
        arraylist.add(null);
        System.out.println(arraylist);
        System.out.println(arraylist.size());
        System.out.println("-------------");

        Iterator iterator = arraylist.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
        System.out.println("-----------------");

        List l1 = new ArrayList<>();
        l1.add(123);
        l1.add("Shyam");
        System.out.println(l1);
        System.out.println(l1.isEmpty());
        System.out.println("-------------");

        List l2 = new ArrayList<>();
        System.out.println(l2.isEmpty());


    }
}
