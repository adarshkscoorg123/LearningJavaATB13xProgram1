package ex_19_Java_Constructors;

import java.sql.SQLOutput;

public class Lab_149_Constructors_ex3 {

    public static void main(String[] args) {

        Car_150 c1 = new Car_150();
        Car_150 c2 = new Car_150();
        System.out.println(c1.name); // BMW
        System.out.println(c1.year);
        System.out.println(c1.model);
        c1.name = "Audi";
        System.out.println(c1.name); // Audi
        System.out.println("----------------");

        System.out.println(c2.name); // BMW
        System.out.println(c2.year);
        System.out.println(c2.model);
        System.out.println("----------");


        Baby_151 b1 = new Baby_151();
        System.out.println(b1.name);
        b1.name = "Adarsh";
        System.out.println(b1.name);
        Baby_151 b2 = new Baby_151();
        System.out.println(b2.name);

    }


}
