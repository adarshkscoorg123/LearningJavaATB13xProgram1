package ex_13_Java_DoWhile;

import java.util.Scanner;

public class Lab_095_Interview_Vowelconsonant_switch {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a single alphabet");
        char ch = scanner.next().toLowerCase().charAt(0);

        switch (ch){

            case 'a', 'e', 'i', 'o', 'u' -> System.out.println("Its a vowel");
            default -> System.out.println("Its a consonant");
        }
    }
}
