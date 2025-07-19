package ex_35_Java_Exceptions;

public class Lab_259_TryCatch_MultipleAlternate {

    public static void main(String[] args) {

        String s1 = null;

        try {
            s1.trim();
            int a = 10/0;
        }
        catch (NullPointerException | ArithmeticException e){
            System.out.println(e.getMessage());
            System.out.println("Null pointer or Arithmetic exception");
        }

        catch (Exception e){
            System.out.println("Yes");
        }

        System.out.println("End of the program");
    }
}
