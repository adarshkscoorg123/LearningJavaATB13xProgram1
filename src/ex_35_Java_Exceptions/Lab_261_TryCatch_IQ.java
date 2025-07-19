package ex_35_Java_Exceptions;

public class Lab_261_TryCatch_IQ {

    public static void main(String[] args) {

        System.out.println("Starting of the program");

        int b = 0;
        int c = 0;
        String s1 = null;

        try {
            b = 10/0;
            s1.trim();
            System.out.println(b);
        }
        catch (ArithmeticException e){
            System.out.println(e.getMessage());
            //e.printStackTrace();
        }

        catch (Exception e){
            System.out.println(e.getMessage());
            //e.printStackTrace();
        }
        System.out.println("End of the program");
    }
}
