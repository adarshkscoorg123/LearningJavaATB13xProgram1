package ex_37_Java_CollectionsFramework_List;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Lab_277_ArrayList_ex2 {

    public static void main(String[] args) {

        List list = new ArrayList<>();
        list.add("1"); // indexes- 0
        list.add("2"); // 1
        list.add("3"); // 2
        list.add("3"); // 3
        list.add(4);   // 4
        list.add(true);// 5
        list.add("5"); // 6
        list.add("3"); // 7
        System.out.println(list);
        System.out.println(list.size());
        System.out.println(list.isEmpty());
        System.out.println(list.contains(4));
        System.out.println("-----------");
        System.out.println(list.indexOf("3")); // first occurrence
        System.out.println(list.lastIndexOf("3")); // last occurrence
        System.out.println("--------");

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
        System.out.println("-------------");

        for (Object o : list){
            System.out.println(o);
        }

        list.set(1,35);
        list.set(4, "Adarsh");
        list.set(5, "Suresh");
        System.out.println(list);

        Iterator iterator = list.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }

        list.remove(0);
        list.remove(2);
        list.remove(3);
        System.out.println(list);

        Iterator iterator1 = list.iterator();
        while(iterator1.hasNext()){
            System.out.println(iterator1.next());
        }

        list.clear();
        System.out.println(list);
    }
}
