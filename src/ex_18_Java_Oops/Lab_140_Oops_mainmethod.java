package ex_18_Java_Oops;

public class Lab_140_Oops_mainmethod {

    public static void main(String[] args) {

        Lab_138_Personclass person = new Lab_138_Personclass(); // created the object of Person class
        // Access the attributes and methods of a Person clas through objects

        // Accessing the attributes of Person class
        System.out.println(person.name);
        System.out.println(person.age);
        System.out.println(person.gender);
        System.out.println(person.height);
        System.out.println(person.is_married);
        System.out.println("--------");

        // Accessing the methods of Person class
        person.walk();
        person.sleep();
        person.eat();
        String adarsh = person.food(6);
        System.out.println(adarsh);
        System.out.println("-------------------");

        Lab_139_Dogclass dog = new Lab_139_Dogclass();

        // Accessing the attributes of Dog class
        System.out.println(dog.name);
        System.out.println(dog.breed);
        System.out.println(dog.color_eyes);

        System.out.println("--------");

        // Accessing the methods of Dog class
        dog.walk();
        dog.bark();
    }
}
