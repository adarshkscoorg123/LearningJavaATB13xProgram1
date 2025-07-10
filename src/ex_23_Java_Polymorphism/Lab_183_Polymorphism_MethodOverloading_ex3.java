package ex_23_Java_Polymorphism;

public class Lab_183_Polymorphism_MethodOverloading_ex3 {

    public static void main(String[] args) {

        Calculator_184 c1 = new Calculator_184();
        int addition = c1.add(6,4);
        System.out.println(addition);

        double d1 = c1.add(3.14, 4.56);
        System.out.println(d1);

    }

}
