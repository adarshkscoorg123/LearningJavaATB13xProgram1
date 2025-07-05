package ex_17_Arrays;

import java.util.Scanner;

public class Lab_135_Arrays_2d_Right_Triangle {

    public static void main(String[] args) {

        // How we need the pattern
        // n = 3                        n = 4
        // *                            *
        // * *                          **
        // * * *                        ***
        //                              ****

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the n value ");
        int n = sc.nextInt();
        // Right triangle
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i ; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
