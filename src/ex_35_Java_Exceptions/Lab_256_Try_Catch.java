package ex_35_Java_Exceptions;

public class Lab_256_Try_Catch {

    public static void main(String[] args) {

        System.out.println("1");

        try {
            int a = 10/0;
        }
        catch (ArithmeticException e){
            System.out.println(e.getMessage());
            System.out.println("Are you a fool");
        }

        System.out.println("2");
    }


}
