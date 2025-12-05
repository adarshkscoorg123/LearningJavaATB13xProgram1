package ex_31_Java_Static;

public class Lab_238_Static_ex1 {

    public static void main(String[] args) {
        Adarsh1 ad = new Adarsh1(10);
        Adarsh1 ad2 = new Adarsh1(11);

        System.out.println(ad.a);
        System.out.println(ad2.a);
        System.out.println("------------");

        System.out.println(ad.b);
        System.out.println(ad2.b);
        System.out.println(Adarsh1.b);
        System.out.println("------------");


        ad.b = 25;
        System.out.println(ad2.b);
        System.out.println(ad.b);

        ad2.b = 35;
        System.out.println(ad.b);

        System.out.println(Adarsh1.b);
        ad.displayValue();
        ad2.displayValue();

        Adarsh1.staticMethodAd();
    }
}

class Adarsh1{

    int a;  // non static(instance variable)
    static int b = 20; // static - this is shared between the objects

    Adarsh1(int a){
        this.a = a;
    }

    void displayValue(){
        System.out.println(a); // instance varaibles are allowed directly in non-static methods
        System.out.println(b);// static variables in the instance methods are allowed
        //staticMethodAd();// static methods are also allowed
    }

    static void staticMethodAd(){
        System.out.println("I will be called when class is loaded");
        System.out.println(b);

        //System.out.println(a); static methods cannot access non-static variables->
        // unless you create and use it( See the below example)
        //Adarsh1 ad = new Adarsh1(10);
        //System.out.println(ad.a);

        // displayValue(); non static methods are not allowed directly in static methods->
        // unless you create and use it( See the below example)
        //Adarsh1 ad = new Adarsh1(10);
        //ad.displayValue();
    }
}
