package ex_23_Java_Polymorphism;

public class Browser_182 {

    void startBrowser(){
        System.out.println("Starting a default browser");
    }

    String startBrowser(String browser){
        System.out.println("Starting the browser " + browser);
        return browser;
    }

}
