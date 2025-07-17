package ex_31_Java_Static;

public class Lab_240_Static_Real {

    public static void main(String[] args) {
        ATB at = new ATB();
        at.setName("Adarsh");
        String ad = at.getName();
        System.out.println(ad);
        ATB.assignment();
        System.out.println(ATB.coursename);

    }

}



class ATB {

    static {
        System.out.println("Load the class, i will execute");
    }

    {
        System.out.println("IIB is called when object is created");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private String name;
    private String phone;

    static String coursename = "ATB13x";
    static String mentorname = "Pramod";

    static void assignment(){
        System.out.println("Do the assignment");
    }

    void howTheyDoAssignment(){
        System.out.println("It is different");
    }

}
