package ex_19_Java_Constructors;

public class Lab_154_Constructors_ex5 {

    public static void main(String[] args) {

        Person_155 p1 = new Person_155("Adarsh", 9036092015l, "Kushalnagar" );
        Person_155 p2 = new Person_155("Amith", 9423456789l, "Mysore");

        System.out.println(p1.phone);
        System.out.println(p1.address);
        System.out.println("--------------");

        System.out.println(p2.phone);
        System.out.println(p2.address);
        System.out.println("------------------");

        Person_155 p3 = new Person_155();
        System.out.println("--------------------");

        Person_155 p4 = new Person_155("Kavya", 36);
        System.out.println(p4.name);
        System.out.println(p4.age);
        System.out.println("--------------------");

        Person_155 p5 = new Person_155("Susheela");
        System.out.println(p5.name);

    }
}
