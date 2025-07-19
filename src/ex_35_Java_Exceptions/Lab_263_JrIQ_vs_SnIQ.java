package ex_35_Java_Exceptions;

public class Lab_263_JrIQ_vs_SnIQ {

    public static void main(String[] args) {

        System.out.println("Enter the details");
        // Senior QA
        try {
            String ip = args[0];
            int a = Integer.parseInt(ip);
            int b = 100/a;
            System.out.println(b);
        }
        catch (NumberFormatException | ArithmeticException | ArrayIndexOutOfBoundsException e){
            System.out.println(e.getMessage());
        }

    }
}
