package ex_29_Java_Abstraction;

public class Son_213 extends Father_212 {
    @Override
    void property() {
        System.out.println("Son can take the property");
    }

    @Override
    void loan50k() {
        System.out.println("Son has to give the loan of 50k");
    }
}
