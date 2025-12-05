package ex_31_Java_Static;

public class Lab_234_Static {

    public static void main(String[] args) {
        Pramod p1 = new Pramod();
        Pramod p2 = new Pramod();
        Pramod p3 = new Pramod();
        System.out.println(Pramod.a); // static variable can be accessed through class name
        Pramod.drink(); // static method can be accessed through class name
        p1.a = 18;
        p2.a = 20;
        p3.a = 30;
        System.out.println(Pramod.a); // same value since it is static
        System.out.println(p1.a); // same value since it is static
        System.out.println(p2.a);// same value since it is static
        p1.eat();
        p1.b = 34;
        p2.b = 45;
        System.out.println(p1.b); // different since it is not static
        System.out.println(p2.b); // different since it is not static
        System.out.println(p3.b);
    }
}

class Pramod{

    static int a = 10;
    int b = 30;

    public static void main(String[] args) {
        Pramod p1 = new Pramod();
        drink();
    }

    static {
        // This is a static block
        // This is called whenever a class is loaded
        System.out.println("Hi, this is called, becoz class is loaded");
    }

     static void drink(){

        System.out.println("Drinking");
        //dream();
    }

    static void dream(){

        System.out.println("Dreaming");
        //drink();
    }

    void eat(){

        System.out.println("Eating");
        drink();
        sleep();
        System.out.println();
    }

    void sleep(){

        System.out.println("sleep");
        //eat();
    }
}
