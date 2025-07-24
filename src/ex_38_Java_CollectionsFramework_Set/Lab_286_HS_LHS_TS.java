package ex_38_Java_CollectionsFramework_Set;

import java.util.HashSet;
import java.util.*;

public class Lab_286_HS_LHS_TS {

    public static void main(String[] args) {

        Set<String> hs = new HashSet<String>();
        // Hashing mechanism to store the element
        // no order
        // no duplicates
        // e1 -> hashcode (xyz) , e2 -> hashcode(abc)

        // HashSet doesn't keep the order
        hs.add("Apple");
        hs.add("WaterMelon");
        hs.add("Orange");
        hs.add("Papaya");
        //hs.add(1); It is not allowed
        hs.add(null);
        hs.add(null); // Only one null is allowed(latest will be kept)
        System.out.println(hs);
        System.out.println("------------");

        for (String s : hs){
            System.out.println(s);
        }

        // Note: We can use either enhanced for loop or Iterator to loop through the set

        System.out.println("-----------");

        Iterator iterator1 = hs.iterator();
        while(iterator1.hasNext()){
            System.out.println(iterator1.next());
        }
        System.out.println("------------");


        // Linked Hash Set will maintain the order in which it is entered
        Set lhs = new LinkedHashSet();
        //LinkedHashSet mechanism to store the element
        // order will be maintained, no duplicates are allowed
        lhs.add("Dapple");
        lhs.add("Apple");
        lhs.add("Orange");
        lhs.add("Mango");
        lhs.add("Mango");// Only one value is allowed
        lhs.add("mango");
        lhs.add(null);
        lhs.add(null); // Here also only one null is allowed
        System.out.println(lhs);
        System.out.println(lhs.isEmpty());
        System.out.println(lhs.contains("mango"));
        System.out.println(lhs.size());

        System.out.println("------------");

        Set lhs1 = new LinkedHashSet();
        lhs1.add(5);
        lhs1.add(2);
        lhs1.add(98);
        lhs1.add(100);
        lhs1.add(1);
        lhs1.add(9);
        lhs1.add(123);
        lhs1.add(15);
        System.out.println(lhs1);
        System.out.println("-------------");

        // TreeSet will maintain the sorting order automatically
        // ex: Numbers : 1,2 , 5...10  Alphabets: A, B, C....Z  a, b, c .....Z
        Set ts = new TreeSet();
        // Black and Red Tree mechanism to store the element
        // Natural sorting is done
        //Natural sorting-ASCII value
        ts.add("Dapple");
        ts.add("Apple");
        ts.add("Orange");
        ts.add("Mango");
        ts.add("Banana");
        ts.add("Mango");// Only one value is allowed
        ts.add("mango");
        //ts.add(123); This is not allowed since sorting cannot happen with
        // different data type
        // ts.add(null); Null is also not allowed since sorting cannot happen with
        // null values
        System.out.println(ts);

        Set ts1 = new TreeSet();
        ts1.add(5);
        ts1.add(2);
        ts1.add(98);
        ts1.add(100);
        ts1.add(1);
        ts1.add(9);
        ts1.add(123);
        ts1.add(15);
        System.out.println(ts1);
    }
}
