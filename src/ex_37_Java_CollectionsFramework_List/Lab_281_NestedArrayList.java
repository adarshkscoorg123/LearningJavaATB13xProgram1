package ex_37_Java_CollectionsFramework_List;

import java.util.ArrayList;
import java.util.List;

public class Lab_281_NestedArrayList {

    public static void main(String[] args) {

        List<String> fruits = new ArrayList<String>();
        fruits.add("Orange");
        fruits.add("Apple");
        fruits.add("Cherry");
        System.out.println(fruits);

        List<String> fruits2 = new ArrayList<String>();
        fruits2.add("Mango");
        fruits2.add("Grapes");
        fruits2.add("Papaya");
        System.out.println(fruits2);

        List<String> vegetables = new ArrayList<String>();
        vegetables.add("Tomato");
        vegetables.add("potato");
        vegetables.add("Onion");
        System.out.println(vegetables);

        List all_Fruits_Vegetables = new ArrayList();
        all_Fruits_Vegetables.add(fruits);
        all_Fruits_Vegetables.add(fruits2);
        all_Fruits_Vegetables.add(vegetables);
        System.out.println(all_Fruits_Vegetables);
        System.out.println(all_Fruits_Vegetables.get(2));
    }
}
