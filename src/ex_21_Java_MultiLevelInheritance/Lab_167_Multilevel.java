package ex_21_Java_MultiLevelInheritance;

public class Lab_167_Multilevel {

    public static void main(String[] args) {

        Son_165 amith = new Son_165(); // possible
        amith.son();
        amith.father();
        amith.gf();
        System.out.println("-----------");
        //Son_165 s1 = new Father_164(); // this is not possible
        //Son_165 s2 = new GrandFather_163(); // This is also not possible
       // Father_164 f1 = new GrandFather_163(); // This is also not possible

        GrandFather_163 g1 = new Son_165(); // Dynamic dispatch is possible
        g1.gf();
        g1.home(); // In this case GF, Father and Son all have homes
                   // but whoever's object is created, there home will be called
                   // In this case since son's object is created, his home will be called
                   // If son's home is not available,then fathers home will be called
                   // If fathers home is not available, then only GF home will be called
        System.out.println("------------");

        GrandFather_163 g2 = new Father_164(); // Dynamic dispatch is possible
        g2.home(); // Here fathers home will be called since father's object is created
                   // if fathers home is not available then only gf home will be called
        System.out.println("------------");


        Father_164 f1 = new Son_165();
        f1.home(); // Here son's home will be called since son's object is created
                   // if son's home is not available, then fathers home will be called
                   // if fathers' home is not available, then grandfathers home will be called
        System.out.println(f1.gold_gf);

    }
}
