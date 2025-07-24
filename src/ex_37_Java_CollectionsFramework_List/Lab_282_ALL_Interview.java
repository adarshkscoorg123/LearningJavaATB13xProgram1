package ex_37_Java_CollectionsFramework_List;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Lab_282_ALL_Interview {

    public static void main(String[] args) {

        List marks = new ArrayList();
        marks.add(91);
        marks.add(95);
        marks.add(56);
        marks.add(88);

        System.out.println(marks);
        Collections.sort(marks);
        System.out.println(marks);
        System.out.println("------------");

        Collections.sort(marks,Collections.reverseOrder());
        System.out.println(marks);

    }
}
