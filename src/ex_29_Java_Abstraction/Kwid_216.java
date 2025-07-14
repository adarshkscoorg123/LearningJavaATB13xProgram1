package ex_29_Java_Abstraction;

public class Kwid_216 extends Engine_215{
    @Override
    void startEngine() {
        System.out.println("Kwid engine is started");
    }

    @Override
    void stopEngine() {
        System.out.println("Kwid engine is stopped");
    }

    void drive(){
        checkEngine();
        startEngine();
        stopEngine();
    }
}
