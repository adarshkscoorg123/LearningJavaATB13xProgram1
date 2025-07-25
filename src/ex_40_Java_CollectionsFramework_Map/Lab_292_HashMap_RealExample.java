package ex_40_Java_CollectionsFramework_Map;

import java.util.*;

public class Lab_292_HashMap_RealExample {

    public static void main(String[] args) {

        Map<String, Object> student1 = new HashMap<String,Object>();
        student1.put("Name","Diwakar");
        student1.put("Phone", 9036092015l);
        student1.put("Address1","Bangalore");
        student1.put("Pin Code", 570017);

        Map<String, Object> student2 = new HashMap<String,Object>();
        student2.put("Name","Lucky");
        student2.put("Phone", 9844225670l);
        student2.put("Address1","Delhi");
        student2.put("Pin Code", 560014);

        List students = new ArrayList<>();
        students.add(student1);
        students.add(student2);
        System.out.println(students);

        Set book_read_items = new HashSet();
        book_read_items.add("Rich Dad Poor Dad");
        book_read_items.add("Sapiens");
        book_read_items.add("Secret");
        book_read_items.add("Atomic habit");
        book_read_items.add("Atomic habit");
        book_read_items.add("Eat the frog");
        System.out.println(book_read_items);
    }
}
