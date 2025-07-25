package ex_40_Java_CollectionsFramework_Map;

import java.util.HashMap;
import java.util.Map;

public class Lab_291_HashMap_ex2 {

    public static void main(String[] args) {

        Map map = new HashMap();
        map.put("id1", 1);
        map.put("id1", 2);
        map.put("id3", 2);
        map.put("id4", 34);
        map.put("id5", 38);
        map.put("id6", null);
        map.put("id8", null);// multiple null values are allowed
        map.put(null, 100);//
        map.put(null, 101);//
        map.put(null, 99);// One null key is allowed(latest is allowed)

        System.out.println(map);
        System.out.println(map.size());
        System.out.println(map.isEmpty());
        System.out.println(map.containsKey("id8")); // true
        System.out.println(map.containsKey("id9")); // false
        System.out.println(map.containsValue(99)); // true
        System.out.println(map.containsValue(110)); // false
        System.out.println("-------------");

        //Gives all the keys
        System.out.println(map.keySet());

        // Gives all the Values
        System.out.println(map.values());

        System.out.println(map.get("id5")); // gives the particular value of a key
        System.out.println(map.remove("id8")); //removes the key and value
        System.out.println(map);


    }
}
