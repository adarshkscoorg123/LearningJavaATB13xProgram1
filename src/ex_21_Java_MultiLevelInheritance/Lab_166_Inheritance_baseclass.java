package ex_21_Java_MultiLevelInheritance;

public class Lab_166_Inheritance_baseclass {

    public static void main(String[] args) {

        GrandFather_163 g1 = new GrandFather_163();
        System.out.println(g1.gold_gf);
        g1.home();
        g1.gf();
        System.out.println("-------------");

        Father_164 f1 = new Father_164();
        System.out.println(f1.gold_gf);
        f1.home();
        f1.gf();
        f1.father();
        System.out.println("---------");

        Son_165 s1 = new Son_165();
        System.out.println(s1.gold_gf);
        s1.gf();
        s1.home();
        s1.father();
        s1.son();
    }
}
