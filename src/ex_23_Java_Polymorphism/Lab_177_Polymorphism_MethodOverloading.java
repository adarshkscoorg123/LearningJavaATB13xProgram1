package ex_23_Java_Polymorphism;

public class Lab_177_Polymorphism_MethodOverloading {

    public static void main(String[] args) {

        MathOperations_178 m1 = new MathOperations_178();
        int r1 = m1.add(5, 25);
        System.out.println(r1);

        int r2 = m1.add(5, 15, 36);
        System.out.println(r2);

        double r3 = m1.add(3.14, 5.68);
        System.out.println(r3);

        String r4 = m1.add("Adarsh ", "Suresh");
        System.out.println(r4);

    }
}
