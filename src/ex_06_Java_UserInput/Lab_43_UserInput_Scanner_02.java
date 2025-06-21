package ex_06_Java_UserInput;

import java.util.Scanner;

public class Lab_43_UserInput_Scanner_02 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
      //  String input
        System.out.println(" Enter the String");
        String s = scanner.next();
        System.out.println(s);

        // Integer input

        System.out.println("Enter the integer input");
        int int_input = scanner.nextInt();
        System.out.println(int_input);

        //double input

        System.out.println(" Enter the double input");
        double double_input= scanner.nextDouble();
        System.out.println(double_input);

    }
}
