package ex_18_Java_Oops;

public class Lab_143_Oops_Cats {

    // The class where main method is run
    public static void main(String[] args) {

        Cats_144 c1 = new Cats_144();
        Cats_144 c3 = new Cats_144();
        new Cats_144();
        Cats_144 c2;

        System.out.println(c1); // Gives the reference address
        System.out.println(c1.name); // gives the value

        System.out.println(c3); // Same as above( Reference address)
        System.out.println(c3.name); // Gives the value

        c1.running();
        //c2.running(); // cannot be called because c2 object is not created->
        // -> just a reference is created

        new Cats_144().running(); // can be called since new object is created
    }


}
