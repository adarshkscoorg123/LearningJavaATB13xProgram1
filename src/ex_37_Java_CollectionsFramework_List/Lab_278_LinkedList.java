package ex_37_Java_CollectionsFramework_List;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Lab_278_LinkedList {

    public static void main(String[] args) {
        // The below is a list without generics
        List linkedList = new LinkedList<>();
        linkedList.add("1");
        linkedList.add(2);
        linkedList.add(true);
        linkedList.add("Adarsh");
        System.out.println(linkedList);

        // The below is a integer list
        List <Integer> integerList = new LinkedList<Integer>();
        integerList.add(2);
        integerList.add(4);
        //integerList.add("5"); not possible
        integerList.add(6);
        integerList.add(8);
        System.out.println(integerList);

        Iterator iterator = integerList.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }

        // The below is a String list
        List <String> stringList = new LinkedList<String>();
        stringList.add("KS");
        stringList.add("Adarsh");
        stringList.add("4");
        //stringList.add(5); This is not possible
        stringList.add("Suresh");
        stringList.add("Suresh");
        stringList.add("Sairam");
        stringList.add("Madhu");
        stringList.add("Sudhan");
        System.out.println(stringList);
        System.out.println("First Element: "+stringList.getFirst());
        System.out.println("Last Element: "+stringList.getLast());
        System.out.println(stringList.removeFirst()); // removing elements
        System.out.println(stringList.removeLast());
        System.out.println("Linked list after Removal :"+stringList);
        System.out.println("Size of LinkedList :" +stringList.size());
        stringList.addFirst("Super");
        stringList.addLast("Man");
        System.out.println(stringList);

        Iterator iterator2 = stringList.iterator();
        while(iterator2.hasNext()){
            System.out.println(iterator2.next());
        }

        // The below is a Float list
        List <Float> floatList = new LinkedList<Float>();
        floatList.add(2f);
        floatList.add(4f);
        floatList.add(5f);
        floatList.add(9f);
        //floatList.add("Ad"); This is not possible
        System.out.println(floatList);

        Iterator iterator1 = floatList.iterator();
        while(iterator1.hasNext()){
            System.out.println(iterator1.next());
        }
    }
}
