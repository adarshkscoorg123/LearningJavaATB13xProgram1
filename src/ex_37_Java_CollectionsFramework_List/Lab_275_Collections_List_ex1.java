package ex_37_Java_CollectionsFramework_List;

import java.util.ArrayList;
import java.util.List;

public class Lab_275_Collections_List_ex1 {

    public static void main(String[] args) {

        List l1 = new ArrayList<>(); // Dynamic dispatch-this can be used
        ArrayList l2 = new ArrayList<>(); // this also can be used
        l1.add("Hello");
        l1.add(12);
        l1.add(true);
        l1.add("Blah Blah");
        System.out.println(l1);

        l2.add("World");
        l2.add(22);
        l2.add(false);
        l2.add("Meow Meow");
        System.out.println(l2);
    }
}
