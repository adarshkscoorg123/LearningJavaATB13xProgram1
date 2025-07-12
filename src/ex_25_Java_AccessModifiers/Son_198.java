package ex_25_Java_AccessModifiers;

public class Son_198 extends Father_197{


    void weCanUse(){
        //System.out.println(gold); // cant be accessed since it is private
        System.out.println(car);
        System.out.println(bhk3);
    }
}
