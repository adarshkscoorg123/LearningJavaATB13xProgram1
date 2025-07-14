package ex_30_Java_Abstraction_Interface;

public class Car_227 implements Brakes_225, Engine_226{

    void drive(){
        applyBreak();
        releaseBreak();
        startEngine();
        stopEngine();
        carModel();
    }

    @Override
    public void applyBreak() {
        System.out.println("Apply the break");
    }

    @Override
    public void releaseBreak() {
        System.out.println("Release the break");
    }

    @Override
    public void carModel() {
        System.out.println("The car model is Renault");
    }

    @Override
    public void startEngine() {
        System.out.println("Start the Engine");
    }

    @Override
    public void stopEngine() {
        System.out.println("Stop the Engine");
    }
}
