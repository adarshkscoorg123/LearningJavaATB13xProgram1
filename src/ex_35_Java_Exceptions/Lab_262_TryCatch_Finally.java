package ex_35_Java_Exceptions;

import java.util.Scanner;

public class Lab_262_TryCatch_Finally {

    public static void main(String[] args) {

        Scanner sc = null;
        sc = new Scanner(System.in);
        System.out.println("Enter the value of V");
        int v = sc.nextInt();

        try {
            int b = 10/v;
            System.out.println(b);
        }
        catch (ArithmeticException e){
            System.out.println(e.getMessage());
        } finally {
            System.out.println("end of the program");
            sc.close();
        }


    }
}
