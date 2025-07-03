package ex_17_Arrays;

import java.util.Scanner;

public class Lab_125_Arrays_Userinput {

    public static void main(String[] args) {

        // take the user input of any array

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of an array");
        int size = sc.nextInt();

        int[] number_marks = new int[size];


        for (int i = 0; i < number_marks.length; i++) {
            System.out.println("enter the numbers");
            number_marks[i]= sc.nextInt();
        }

        System.out.println(" Below code is printing the elements! ");

        for (int i = 0; i < number_marks.length; i++) {
            System.out.println(number_marks[i]);
        }

    }
}
