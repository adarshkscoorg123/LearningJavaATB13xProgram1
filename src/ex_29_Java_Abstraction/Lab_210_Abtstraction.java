package ex_29_Java_Abstraction;

public class Lab_210_Abtstraction {

    public static void main(String[] args) {

        Car_211 c1 = new Car_211();
        c1.start();

        //Father_212 f1 = new Father_212(); // this is not possible since it is abstract
                                        // in nature

        Son_213 s1 = new Son_213();
        s1.loan50k();
        s1.property();
        s1.loan25k();
        s1.gold();

        Father_212 f1 = new Son_213(); // dynamic dispatch
//        f1.gold();   // All these can be accessed since son extends father
//        f1.loan25k();
//        f1.loan50k();
//        f1.property();

    }

}
