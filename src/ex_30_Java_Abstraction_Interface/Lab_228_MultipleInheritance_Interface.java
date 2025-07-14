package ex_30_Java_Abstraction_Interface;

public class Lab_228_MultipleInheritance_Interface {

    public static void main(String[] args) {

        Child c1 = new Child();
        c1.money();
    }
}


class Child implements Father1_229, Father2_230{


    @Override
    public void money() {
        System.out.println("Child has its own money");
    }
}