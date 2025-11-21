package ex_10_Java_Switch;

public class Lab_062_JDK13Above {

    public static void main(String[] args) {

        int itemcode = 002;

        switch (itemcode){
            // In JDK > 13
            // No need of break keyword
            // only One line is  supported

            case 001 -> System.out.println("001");
            case 002 -> System.out.println("002");
            case 003 -> System.out.println("003");
            case 004 -> System.out.println("004");

            default -> System.out.println("Default");
        }
    }
}
