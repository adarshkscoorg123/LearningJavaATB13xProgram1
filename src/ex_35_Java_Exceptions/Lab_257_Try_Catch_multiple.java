package ex_35_Java_Exceptions;

public class Lab_257_Try_Catch_multiple {

    public static void main(String[] args) {

        System.out.println("1");

        try {
            int a = 10/0;
        }
       catch (ArithmeticException e){
           System.out.println(e.getStackTrace());
           System.out.println(e.getMessage());
        }

        catch (Exception e){
            System.out.println("Are you fool too");
        }

        // First smaller classes are used to handle exception and then bigger classes
        // ex: in the above case ArithmeticException is used to handle exception
        // and then only bigger class like Exception is used

        // Other way is not possible i.e first bigger class and then smaller class
        // i.e we cannot use first Exception class and then ArithmeticException class

        System.out.println("2");
    }
}
