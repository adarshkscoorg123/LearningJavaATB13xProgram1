package ex_29_Java_Abstraction;

public class Company_219 extends Employee_218{


    Company_219(){
        super();
        System.out.println("Default constructor of Company");
    }

    Company_219(String name, String address, int number){
        super("Amith","890",1234);
        System.out.println(super.name);
        System.out.println(name);
        System.out.println("Default constructor of Company");
    }
    @Override
    double completepay() {
        return 1000;
    }
}
