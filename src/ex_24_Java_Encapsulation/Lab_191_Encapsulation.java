package ex_24_Java_Encapsulation;

public class Lab_191_Encapsulation {

    public static void main(String[] args) {

        VWOLogin_192 vwologin = new VWOLogin_192("admin", "pass123");
        System.out.println(vwologin.password);
        vwologin.password = "pass453"; // password can be changed which is not advisable
        System.out.println(vwologin.password);

        GoodVMOLogin_193 glogin = new GoodVMOLogin_193("administrator", "pass245");
        // System.out.println(glogin.password); // Not possible since the variable is private
        System.out.println(glogin.getPassword());
        System.out.println(glogin.getUsername());
        System.out.println("--------------");

        glogin.setPassword("onolokoe1234", true);
        System.out.println(glogin.getPassword());
        glogin.setUsername("Adarsh");
        System.out.println(glogin.getUsername());
    }


}
