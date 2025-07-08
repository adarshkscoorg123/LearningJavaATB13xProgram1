package ex_20_Java_Inheritance;



public class Lab_156_Inheritance {

    // Note: Father class/ Parent class / Base class / Super class
    //       Son class  /  Child class  / Derived class / Sub class

    public static void main(String[] args) {

        Father_157 f1 = new Father_157();
        System.out.println(f1.gold);
        f1.bhk_2();

        Son_158 s1 = new Son_158();
        System.out.println(s1.silver);
        System.out.println(s1.gold);
        s1.bhk_2();
        s1.bhk_3();
    }


}
