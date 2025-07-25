package ex_40_Java_CollectionsFramework_Map;

import java.util.Map;
import java.util.TreeMap;

public class Lab_295_TreeMap {

    public static void main(String[] args) {

        // Creating TreeMap
        Map<String,Integer> values = new TreeMap<String,Integer>();
        // Insert the elements(note the order
        values.put("Second", 2);
        values.put("First", 1);
        values.put("Ninth", 9);
        values.put("Third", 3);
        System.out.println("TreeMap (sorted by keys): " + values);

        // Replace the values
        values.replace("First",11);
        values.replace("Second",22);
        System.out.println("After Replacement :" +values);

        //Remove the key and values
        System.out.println(values.remove("Ninth"));
        System.out.println(values);





    }
}
