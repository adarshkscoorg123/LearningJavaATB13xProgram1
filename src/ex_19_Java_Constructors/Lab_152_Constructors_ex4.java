package ex_19_Java_Constructors;

public class Lab_152_Constructors_ex4 {

    public static void main(String[] args) {

        BabyA_153 b1 = new BabyA_153();
        System.out.println(b1.name);
        System.out.println(b1.aadhar_number);
        System.out.println(b1.year);
        System.out.println(b1.month);
        System.out.println(b1.day);
        System.out.println("--------------");

        BabyA_153 b2 = new BabyA_153();
        System.out.println(b2.name);
        System.out.println(b2.aadhar_number);
        System.out.println(b2.year);
        System.out.println(b2.month);
        System.out.println(b2.day);
        System.out.println("--------------");

        BabyA_153 b3 = new BabyA_153("Adarsh", "ABCDef45", 1986, 04, 06);
        System.out.println(b3.name);
        System.out.println(b3.year);
        System.out.println(b3.day);
        System.out.println(b3.aadhar_number);
        System.out.println(b3.month);
        System.out.println("----------------");

        BabyA_153 b4 = new BabyA_153("Amith", "ABCD9865GF", 1989, 03, 04);
        System.out.println(b4.name);
        System.out.println(b4.year);

}}
