package ex_36_Java_Generics;

import java.util.ArrayList;
import java.util.List;

public class Lab_273_Generics_List {

    public static void main(String[] args) {

        // Note: Generics can be a method. it can be a class, or it can be Collections

        // Here in the below example, Generics is not used, so any data can be stored
        List normalList = new ArrayList();
        normalList.add(10);
        normalList.add("Pramod");
        normalList.add(true);
        normalList.add(3.14);
        System.out.println(normalList);


        // In the below examples, Generics like Integer and String are used in the <>
        // so only Specifics like Integer data and String data can be stored
        List <Integer> integerList = new ArrayList<Integer>();
        List <String> stringList = new ArrayList<String>();
        integerList.add(10);
        integerList.add(20);
        integerList.add(1000);
        //integerList.add("Pramod"); //not possible since <Integer> is used
        System.out.println(integerList);

        stringList.add("Pramod");
        stringList.add("Dutta");
        stringList.add("KS");
        //stringList.add(45); //not possible since <String> is used
        System.out.println(stringList);
    }
}
