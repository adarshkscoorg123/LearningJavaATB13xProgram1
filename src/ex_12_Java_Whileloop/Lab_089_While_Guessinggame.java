package ex_12_Java_Whileloop;

import java.util.Random;
import java.util.Scanner;

public class Lab_089_While_Guessinggame {

    public static void main(String[] args) {
        // Guess a number between 1 and 100
        // Random -> 1 to 100

        Random random = new Random();
        int numbertoguess = random.nextInt(100)+1; // 0 to 100
        //System.out.println(numbertoguess);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number");

        int guess;
        int attempts = 0;

        while (true){
            guess = scanner.nextInt();
            attempts++;

            if (guess < numbertoguess){
                System.out.println("Too low, try again");
            } else if (guess > numbertoguess) {
                System.out.println("Too high, try again");
            }

            else{
                System.out.println("Correct ! you guessed it in " + attempts + "attempts") ;
                break;

            }


        }




    }
}
