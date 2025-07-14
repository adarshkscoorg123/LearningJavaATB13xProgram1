package ex_30_Java_Abstraction_Interface;

public class Lab_232_Abstraction {


}

abstract class Incomplete_abstract{
    int a = 10;
    abstract void display1();
    void display2(){
        a= 25; // possible
        System.out.println("Print");
    }

    interface Incomplete_interface{
        int a = 10; // this is by default Final
        default void display2(){
           // a = 12; // This cannot be changed since it is final
            System.out.println("Default is allowed");
        }
        static void display3(){
            System.out.println("Default static is allowed");
        }

    }

}
