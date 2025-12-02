package ex_18_Java_Oops;

public class Lab_141_Oops_constructors {

    public static void main(String[] args) {
        // The class where main method is run
        Student_142 s1 = new Student_142(); // It is a object creation
        //s1.name = "Adarsh";
        //System.out.println(s1.name);
        s1.work();
        System.out.println(s1.name);
        Student_142 s2; // This is just a reference creation
        new Student_142(); // This is another object creation
    }


}

