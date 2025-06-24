package ex_12_Java_Whileloop;

import java.util.Scanner;

public class Lab_088_While_Factorial {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the factorial program \nEnter the number:");

        if(!scanner.hasNext()){
            System.out.println("Enter the integer you fool");
            return;
        }
        int number = scanner.nextInt();

        int factorial = 1;

        if (number <0){
            System.out.println("Negative factorial is not allowed");
        }

        if (number == 0){
            System.out.println(factorial);
        }
        else {
            // calculate the factorial  ex: 5!= 5*4*3*2*1= 120
                                        //ex2: 4! = 4*3*2*1= 24  ex3: 3!= 3*2*1= 6
            for (int i = 1; i <= number; i++){
                factorial = factorial * i; // 1, 2, 6, 24, 120
                System.out.println(factorial);
            }

            System.out.println("Factorial is " + factorial);

        }





        // stopped the recording of 17th june at 40 minutes

    }
}
