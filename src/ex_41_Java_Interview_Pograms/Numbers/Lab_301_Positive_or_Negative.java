package ex_41_Java_Interview_Pograms.Numbers;

import java.util.Scanner;

public class Lab_301_Positive_or_Negative {

    public static void main(String[] args) {

        int myNum = 4; // Is this a positive or negative number?

        if (myNum > 0) {
            System.out.println("The value is a positive number.");
        } else if (myNum < 0) {
            System.out.println("The value is a negative number.");
        } else {
            System.out.println("The value is 0.");
        }

        System.out.println("-----------Part2------- Using Scanner");

        int number1;
        Scanner myObj = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Type a number:");
        number1 = myObj.nextInt();

        if (number1 > 0) {
            System.out.println("The value is a positive number.");
        } else if (number1 < 0) {
            System.out.println("The value is a negative number.");
        } else {
            System.out.println("The value is 0.");
        }
    }
}
