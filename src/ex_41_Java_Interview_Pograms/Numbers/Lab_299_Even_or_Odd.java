package ex_41_Java_Interview_Pograms.Numbers;

import java.util.Scanner;

public class Lab_299_Even_or_Odd {

    public static void main(String[] args) {

        int number = 5;

        if (number % 2 == 0) {
            System.out.println(number + " is even.");
        } else {
            System.out.println(number + " is odd.");
        }
        System.out.println("------Part2-----");

        int number1;
        Scanner myObj = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Type a number:");
        number1 = myObj.nextInt();

        if (number1 % 2 == 0) {
            System.out.println(number1 + " is even.");
        } else {
            System.out.println(number1 + " is odd.");
        }

//       Explanation: The operator % gives the remainder when dividing a number.
//        - If number % 2 equals 0, the number divides evenly by 2, it is even.
//        - Otherwise, it has a remainder, it is odd.

    }

}
