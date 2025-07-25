package ex_40_Java_CollectionsFramework_Map;

import java.util.HashMap;
import java.util.Map;

public class Lab_290_HashMap_Example {

    public static void main(String[] args) {

        Map<String,Integer> vehicles = new HashMap<String,Integer>();
        vehicles.put("MG Astor", 1);
        vehicles.put("I10", 2);
        vehicles.put("Honda", 4);
        vehicles.put("BMW", 3);
        vehicles.put("TESLA", 5);
        vehicles.put("TESLA", 10); // latest value will be taken

        //vehicles.put(124, "Audi"); not possible
        System.out.println(vehicles);
        System.out.println("Total Vehicles :" +vehicles.size());
        System.out.println("Keys" +vehicles.keySet());
        System.out.println("values" +vehicles.values());

        // Iterating over the map
        for (String key : vehicles.keySet()){
            //System.out.println(key);
            System.out.println(key + " -> Values :" +vehicles.get(key));
        }

        // Checking if key exists or not
        if (vehicles.containsKey("Audi")){
            System.out.println("Yes");
        }
        else {
            System.out.println("No");
        }

        // Checking if value exists or not
        if (vehicles.containsValue(99)){
            System.out.println("value exists");
        }
        else {
            System.out.println("value doesn't exist");
        }

        vehicles.clear();
        System.out.println("size after clearing " +vehicles.size());

    }


}
