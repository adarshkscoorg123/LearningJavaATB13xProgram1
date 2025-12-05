package ex_31_Java_Static;

public class Lab_241_Static_WebAutomation {

    public static void main(String[] args) {

        Automation t1 = new Automation();
        System.out.println(Automation.driver);

        Automation t2 = new Automation();
        Automation t3 = new Automation();

        System.out.println(t2.driver);
        System.out.println(t3.driver);

        t2.driver = "Firefox";
        System.out.println(t3.driver);
        System.out.println(Automation.driver);

    }
}

class Automation {
    static String driver = "Chrome";
}
