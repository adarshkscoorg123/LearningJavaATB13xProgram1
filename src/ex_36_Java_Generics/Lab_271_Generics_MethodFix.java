package ex_36_Java_Generics;

public class Lab_271_Generics_MethodFix {

    public static void main(String[] args) {
        display(3, 4); // Integer
        display(3.35, 4.90); // Double
        display("Pramod", "Dutta"); // String , String
        display("Adarsh", 46); // String, Integer
        display(24, "sairam"); // integer, String
        display(true, false); // boolean
        int b = display(10,20,30);
        System.out.println(b);
        double b1 = display(11.25,20.25,30.25);
        System.out.println(b1);
    }
    // The below method is a generic method
    static <T> void display(T a, T b){
        System.out.println(a);
        System.out.println(b);
    }

    // The below method is a generic method with return type
    static <T> T display(T a, T b, T c){
        System.out.println(a);
        System.out.println(b);
        return c;
    }

}
