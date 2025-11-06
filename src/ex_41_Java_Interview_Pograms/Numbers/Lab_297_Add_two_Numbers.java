package ex_41_Java_Interview_Pograms.Numbers;

import java.util.Scanner;

public class Lab_297_Add_two_Numbers {

    public static void main(String[] args) {
        int x = 5;
        int y = 6;
        int sum = x + y;
        System.out.println(sum); // Print the sum of x + y
        System.out.println("----------Part2--------");

        int number1;
        int number2;
        int sum_2;
        Scanner myObj = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Type a number:");
        number1 = myObj.nextInt(); // Read user input

        System.out.println("Type another number:");
        number2 = myObj.nextInt(); // Read user input

        sum_2 = number1 + number2;
        System.out.println("Sum is: " + sum_2); // Output user input

        // Explanation: Here we use the Scanner class to read two numbers from the keyboard. The method nextInt() reads an integer from the user.
        // We then add the two numbers together and print the result.
    }
}
