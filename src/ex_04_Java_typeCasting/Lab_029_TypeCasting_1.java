package ex_04_Java_typeCasting;

public class Lab_029_TypeCasting_1 {

    public static void main(String[] args) {

        byte b = 10;
        int a1= (int)b;// Widening -> Explicit Casting , In JVM explicit widening is not required

        int a = b; // Widening ->  Implicit Casting

        System.out.println("Explicit casting " +a1);
        System.out.println("Implicit casting " +a);


    }
}
