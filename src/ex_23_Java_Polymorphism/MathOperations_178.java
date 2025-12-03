package ex_23_Java_Polymorphism;

public class MathOperations_178 {

    // In the same class, when you have methods with same method name, but different
    // arguments and different return types

    int add(int a, int b){
        return a+b;
    }

    int add(int a, int b , int c){
        return a+b+c;
    }

    double add(double a, double b){
        return a+b;
    }

    String add(String a, String b){
        return a + b;
    }
}
