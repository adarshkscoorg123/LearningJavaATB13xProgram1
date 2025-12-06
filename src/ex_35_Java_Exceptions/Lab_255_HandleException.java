package ex_35_Java_Exceptions;

public class Lab_255_HandleException {

    public static void main(String[] args) {

        int a = 0;
        try {
            a = 10/0; // Arithmetic exception
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
            //System.out.println(" Divide by zero not allowed");
        }
        System.out.println(a);

        //Checked-JVM
        //JVM knows about it, During Complilation - JVM is saying that
        //there can be case when this file is not found

        //JVM knows that this may lead to file not found exception
        // so it is telling to handle it

    }
}
