package ex_30_Java_Abstraction_Interface;

public interface Polygon_221 {

    void getArea(int length, int breadth);

    // The below functions are available in Interfaces, it's an exception

    default void complete(){
        System.out.println("Default is possible, its a exception in Interfaces");
    }

    static void staticComplete(){
        System.out.println("Static function in interface is allowed");
    }
}
