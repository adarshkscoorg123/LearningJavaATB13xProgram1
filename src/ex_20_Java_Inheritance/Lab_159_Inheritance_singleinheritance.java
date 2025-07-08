package ex_20_Java_Inheritance;

public class Lab_159_Inheritance_singleinheritance {

    public static void main(String[] args) {

        TestCase1_161 t1 = new TestCase1_161();
        t1.runningTc1();
        System.out.println("--------------");

        TestCase2_162 t2 = new TestCase2_162();
        t2.runningTc2();
        System.out.println("----------");

        // Here we are creating parent reference with child object-this concept is called as
        // dynamic dispatch

        // How to remember this concept
        // When child is born, father is available - dynamic dispatch
        // but when father is born, child cannot be available

        Commontoall_160 c1 = new TestCase1_161(); // dynamic dispatch(extends)
        c1.startBrowser();
        System.out.println("------------");

        Commontoall_160 c2 = new TestCase2_162(); // dynamic dispatch(extends)
        c2.readExcelFile();

        TestCase2_162 t3 = new TestCase2_162(); // possible
        //TestCase2_162 t4 = new CommonToAll_160(); this is not possible because when father is born
        //child cannot be available
    }
}
