package ex_14_Java_Functions;

public class Lab_097_Method_functions {

    // step 1 - function definition
     static void f1(){  //
        System.out.println("Hi, creating a function");
    }

    static void name_of_function(){
        System.out.println("This is the code we want to execute");
    }

    public static void main(String[] args) {
        // step 2- function / method call
        Lab_097_Method_functions l1 = new Lab_097_Method_functions();
        f1();
        name_of_function();
    }


}
