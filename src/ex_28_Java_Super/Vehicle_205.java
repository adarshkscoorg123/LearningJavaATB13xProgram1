package ex_28_Java_Super;

public class Vehicle_205 {

    public int maxSpeed = 100;

    Vehicle_205() {
        System.out.println("Default constructor of parent");
    }

    Vehicle_205(int a) {
        System.out.println("Parametrized constructor of parent" +a);
    }

    void message(int a) {
        System.out.println("type 2");
    }

    void message() {
        System.out.println("type 1");
    }

    int message(String a) {
        System.out.println("Type 4");
        return 0;
    }

    void display(){
        System.out.println("Vehicle parent");
    }

}
