package ex_10_Java_Switch;

public class Lab_059_Interview_2 {

    public static void main(String[] args) {

        char ch = 'A';
        switch (ch){

            case 65:
                System.out.println("Match ASCII");
                break;

            case 66:
                System.out.println("Match ASCII of value 2");
                break;

            default:
                System.out.println("No match");
                break;
        }
    }
}
