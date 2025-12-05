package ex_31_Java_Static;

public class Lab_239_Static_ex2 {

    public static void main(String[] args) {
        Baap b1 = new Baap();
    }


}

class Baap {

    static {
        System.out.println("SIB is called once class is loaded");
    }

    int a = 10;
    static int c = 25;

    void beta(){
        System.out.println(c); // possible
        System.out.println("Non static function");
        System.out.println(a); // possible
        commonToAll(); // possible to access
    }

    static void commonToAll(){
        System.out.println("Static function");
        //System.out.println(a); cannot access
        //beta(); cannot access
//        Baap b2 = new Baap(); Can access if we create object and use
//        System.out.println(b2.a);
//        b2.beta();

    }

}
