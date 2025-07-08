package ex_21_Java_MultiLevelInheritance;

public class Lab_168_MultiLevel_ex2 {

    public static void main(String[] args) {

        //Son_165 s1 = new Father_164(); // This is not possible
        //Son_165 s2 = new GrandFather_163(); // This is also not possible
        Son_165 adarsh = new Son_165(); // it is possible
        System.out.println(adarsh.gold_gf);
        adarsh.gf();
        System.out.println("--------------");

        GrandFather_163 grandFather = new Son_165();
        grandFather.home();

        //GrandFather_163 grandFather1 = new Father_164();
        //grandFather1.home();


    }
}
