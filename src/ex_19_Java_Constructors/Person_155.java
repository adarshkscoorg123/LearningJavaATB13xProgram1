package ex_19_Java_Constructors;

public class Person_155 {

    String name;
    long phone;
    String address;
    int age;


    //Below are the examples for constructor overloading

    // Default constructor
    Person_155(){
        System.out.println("Default constructor");

    }

    // Parametrized Constructor 1
    Person_155(String name, long phone, String address){
        this.name = name;
        this.phone = phone;
        this.address = address;
    }

    // Parametrized Constructor 2
    Person_155(String name, int age){
        this.name= name;
        this.age = age;
    }
    // Parametrized Constructor 3
    Person_155(String name){
        this.name = name;
    }
}
