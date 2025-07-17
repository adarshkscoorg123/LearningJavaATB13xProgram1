package ex_32_Java_IIB;

public class Lab_237_IIB_ex2 {

    public static void main(String[] args) {
        Ada a1 = new Ada();
    }

}

class Ada {

    Ada() {
        System.out.println("DC");
    }

    {
        System.out.println("Hi,I am IIB");
        System.out.println("If you want to execute or call something when object is created");
    }

    {
        System.out.println("Hi, I am IIB 2");
    }

    {
        System.out.println("Hi, I am IIB 3");
    }

    static {
        System.out.println("I am static and i will be called first");
    }

}
