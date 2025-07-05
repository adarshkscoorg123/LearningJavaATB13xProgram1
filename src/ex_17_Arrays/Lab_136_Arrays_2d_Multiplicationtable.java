package ex_17_Arrays;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Lab_136_Arrays_2d_Multiplicationtable {

    public static void main(String[] args) {
        // Find the multiplication table

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the size");
        int size_of_the_table = scanner.nextInt();

        for (int i = 0; i < size_of_the_table ; i++) {
            for (int j = 0; j < size_of_the_table; j++) {
                System.out.print(i*j + " | ");
            }
            System.out.println();
        }
    }
}
