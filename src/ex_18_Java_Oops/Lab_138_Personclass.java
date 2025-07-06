package ex_18_Java_Oops;

public class Lab_138_Personclass {
    // This class gives the concept of OOPS

    // Below are the attributes/properties/instance variables/ member variables of a class
    String name;
    int age;
    int height;
    String gender;
    boolean is_married;

    // Below are the behaviours/functions/methods/instance methods/member methods of a class

    public void walk(){
        System.out.println("walking");
    }

    void eat(){
        System.out.println("eating");
    }

    void sleep(){
        System.out.println("sleeping");
    }

    String food(int a ){
        System.out.println("Which food");
        return "ab";
    }

}
