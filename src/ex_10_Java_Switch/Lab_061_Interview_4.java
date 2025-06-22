package ex_10_Java_Switch;

public class Lab_061_Interview_4 {

    public static void main(String[] args) {

        int a = 98;
        switch (a) {
            case 98:
                System.out.println("98");
                break;
// Similar cases are not allowed(two times  case 98 are not allowed)
            /*
                case 98;
                    System.out.println("98");
                    break;
            */

        }
    }
}
