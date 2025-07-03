package ex_17_Arrays;

import java.util.Scanner;

public class Lab_127_Arrays_Sumofarrays {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size");
        int size = sc.nextInt();

        int[] number_marks = new int[size];

        for (int i = 0; i <number_marks.length ; i++) {
            System.out.println("Enter the numbers");
            number_marks[i]= sc.nextInt();
        }

        int sum = 0;

        for (int i = 0; i < number_marks.length; i++) {
            sum = sum + number_marks[i];
        }

        System.out.println("Sum of the numbers is "+ sum);


        // Second way to add the numbers

        //int[] numbers = {12, 34, 10};

        //int sum = 0;

        /*for (int i = 0; i <numbers.length ; i++) {
            sum = sum + numbers[i];
        }*/

        //System.out.println("Sum of numbers is "+ sum);
    }
}
