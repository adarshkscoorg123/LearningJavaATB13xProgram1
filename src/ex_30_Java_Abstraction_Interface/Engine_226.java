package ex_30_Java_Abstraction_Interface;

public interface Engine_226 {

    void startEngine();
    void stopEngine();
    void carModel();

    default void test(){
        System.out.println("Default complete function");
    }

}
