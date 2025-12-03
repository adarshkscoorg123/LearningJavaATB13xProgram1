package ex_23_Java_Polymorphism;

public class Lab_181_Polymorphism_Realexample {

    public static void main(String[] args) {

        Browser_182 b1 = new Browser_182();
        b1.startBrowser();
        String b2 = b1.startBrowser("Google Chrome");
        System.out.println(b2);
    }
}
