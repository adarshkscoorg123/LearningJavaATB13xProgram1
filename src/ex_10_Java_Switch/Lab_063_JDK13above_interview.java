package ex_10_Java_Switch;

public class Lab_063_JDK13above_interview {

    public static void main(String[] args) {

        int itemcode = 001;

        switch (itemcode){

            case 001,002,005:
                System.out.println("All of them are electronic gadgets");
                break;

            case 004,006,007:
                System.out.println("This is mech");
                break;

            default:
                System.out.println("None");
                break;

        }
    }
}
