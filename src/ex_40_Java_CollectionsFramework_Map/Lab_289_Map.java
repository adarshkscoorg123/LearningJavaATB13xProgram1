package ex_40_Java_CollectionsFramework_Map;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class Lab_289_Map {

    public static void main(String[] args) {

        // In HashMap, Order is not maintained
        Map map = new HashMap();
        map.put("Name", "Pramod");
        map.put("Roll no", 1);
        map.put("PhoneNo", "9036092015");
        map.put(5 ,"Addy");

        System.out.println(map);

        // In LinkedHashMap, insertion order is maintained according to Keys
        Map map2 = new LinkedHashMap();
        map2.put("Name", "Pramod");
        map2.put("Roll no", 1);
        map2.put("PhoneNo", 903609201);
        map2.put(34, true);
        System.out.println(map2);

        // In TreeMap, Sorting order is maintained according to Keys
        Map map3 = new TreeMap();
        map3.put("LastName", "dutta");
        map3.put("FirstName", "pramod");
        map3.put("Rollno", 4);
        map3.put("PhoneNo",984422567);
        System.out.println(map3);

    }
}
