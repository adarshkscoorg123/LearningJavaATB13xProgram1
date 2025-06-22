package ex_10_Java_Switch;

import java.util.Scanner;

public class Lab_056_Switch {

    public static void main(String[] args) {
      // take a user input and tell which day it is
        // 1 to 7 -> 1 -> Mon ,  5 -> Friday  7 - Sunday
        // 8  ? - Not allowed or error

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the day from 1 to 7");
        int day = scanner.nextInt();

        switch (day) {

            case 1 :
                System.out.println("Mon");
                break;
            case 2 :
                System.out.println("Tue");
                break;
            case 3 :
                System.out.println("Wed");

            case 4 :
                System.out.println("Thu");
                break;

            case 5 :
                System.out.println("Fri");
                break;

            case 6 :
                System.out.println("Sat");
                break;

            case 7 :
                System.out.println("Sun");
                break;

            default:
                System.out.println("Not allowed");
        }

    }
}
