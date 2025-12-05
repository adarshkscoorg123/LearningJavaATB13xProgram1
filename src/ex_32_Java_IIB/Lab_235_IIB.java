package ex_32_Java_IIB;

public class Lab_235_IIB {

    //IIB
    //Instance initialization block == IIB
    //I will be executed when object is created
    public static void main(String[] args) {
        Ad a = new Ad();
        Ad a2 = new Ad();
        Ad a3 = new Ad();
    }
}

class Ad{

    Ad(){
        System.out.println("DC");
    }

    {
        System.out.println("Hi,I am IIB");
        System.out.println("If you want to execute or call something when object is created");
        // mysql connection
        // read a csv, xlsx file
        // read json, xml
        // read a text file or env file
    }

    static {
        System.out.println("Static block will be called once");
    }

}
