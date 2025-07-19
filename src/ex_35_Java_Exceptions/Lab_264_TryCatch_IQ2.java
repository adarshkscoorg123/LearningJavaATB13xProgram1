package ex_35_Java_Exceptions;

public class Lab_264_TryCatch_IQ2 {

    public static void main(String[] args) {

        final double pi = 3.14;
        int a = 0;

        try {
            int x = 10/a;
            System.out.println(x);
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
        finally {
            System.out.println("I will be executed anyhow");
        }
    }
}
