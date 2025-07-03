package ex_17_Arrays;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Lab_129_Arrays_FindElement_LinearSearch {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int size = scanner.nextInt();

        int[] numbers = new int[size];

        for (int i = 0; i < numbers.length; i++) {
            System.out.println("enter the numbers");
            numbers[i] = scanner.nextInt();
        }
        System.out.println("Enter the target element to search");
        int target = scanner.nextInt();

        for (int i = 0; i < numbers.length; i++) {
            if (target == numbers[i]) {
                System.out.println(i);
            }

       /* int[] a = {23, 43, 45, 67, 87, 90};
       // Find the target element - 67 give the index-?
        int target= 90;
        for (int i = 0; i < a.length; i++) {
            if(target == a[i]) {
                System.out.println(i);
            }
        } */
        }
    }
}
