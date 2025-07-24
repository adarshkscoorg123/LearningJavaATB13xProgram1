package ex_38_Java_CollectionsFramework_Set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Lab_285_Set_Program1 {

    public static void main(String[] args) {

        Set hs = new HashSet();
        hs.add(1);
        hs.add("Pramod");
        hs.add("Citric");
        hs.add("Pramod"); // Only one allowed, In set duplicates are not allowed
        hs.add("Dutta");
        hs.add(false);
        System.out.println(hs);

        Set linkedHashSet = new LinkedHashSet();
        linkedHashSet.add(2);
        linkedHashSet.add(true);
        linkedHashSet.add(true); // no duplicates are allowed
        linkedHashSet.add(2);
        System.out.println(linkedHashSet);

        Set treeST = new TreeSet();
        treeST.add("Super");
        treeST.add("Man");
        System.out.println(treeST);
    }
}
