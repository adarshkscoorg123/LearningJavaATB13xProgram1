package ex_23_Java_Polymorphism;

public class Lab_179_MethodOverloading_ex2 {

    public static void main(String[] args) {

        Home_180 h1 = new Home_180();
        h1.task();
        System.out.println("-----------");
        int r1 = h1.task(8);
        System.out.println(r1);
        System.out.println("------------");

        boolean b1 = h1.task(true);
        System.out.println(b1);

        double d1 = h1.task(6.54, 3.14);
        System.out.println(d1);

    }
}
