package ex_35_Java_Exceptions;

public class Lab_258_Try_Catch_Multiple_IQ {

    public static void main(String[] args) {

        String s1 = null;

        try {
            s1.trim();
        }
        catch (NullPointerException e){
            System.out.println(e.getMessage());
            System.out.println("Null pointer error");
        }

        try {
            int a = 10/0;
        }
        catch (ArithmeticException e){
            System.out.println(e.getMessage());
        }
        System.out.println("End of the program");
    }
}
