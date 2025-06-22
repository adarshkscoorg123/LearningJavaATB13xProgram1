package ex_10_Java_Switch;

import java.util.Scanner;

public class Lab_066_Interview_TriangleClassifier {

    public static void main(String[] args) {
// Program to check equilateral triangle, isoseles triangle , scalene triangle
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the length for side 1");
        int side1 = scanner.nextInt();

        System.out.println("Enter the length for side 2 ");
        int side2 = scanner.nextInt();

        System.out.println("Enter the length for side 3");
        int side3 = scanner.nextInt();

        if (side1 == side2 && side1 == side3){
            System.out.println("Equilateral triangle");

        } else if (side1 == side2 || side1 == side3 || side2 == side3) {
            System.out.println("Isoseles triangle");
        }

        else {
            System.out.println("Scalene triangle");
        }
    }
}


