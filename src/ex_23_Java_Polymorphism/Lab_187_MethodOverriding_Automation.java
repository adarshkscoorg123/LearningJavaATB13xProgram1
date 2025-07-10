package ex_23_Java_Polymorphism;

public class Lab_187_MethodOverriding_Automation {

    public static void main(String[] args) {

        ChromeTC_189 c1 = new ChromeTC_189();
        c1.openBrowser();

        Firefox_190 f1 = new Firefox_190();
        f1.openBrowser();

        CommonToAll_188 com = new CommonToAll_188();
        com.openBrowser();
    }


}
