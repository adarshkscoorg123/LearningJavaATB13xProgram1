package ex_40_Java_CollectionsFramework_Map;

import java.util.Hashtable;

public class Lab_294_HashTable {

    public static void main(String[] args) {

        //HashTable is similar to HashMap
        Hashtable<Integer,String>  ht1 = new Hashtable<Integer,String>();
        ht1.put(1, "One");
        ht1.put(1, "One1"); // No duplicates allowed, it will take the latest
        ht1.put(2, "two");
        ht1.put(3, "three");
        //ht1.put(4, null); it will never allow null value
        //ht1.put(null, "Addy"); It will never allow null key
        System.out.println(ht1);

    }
}
