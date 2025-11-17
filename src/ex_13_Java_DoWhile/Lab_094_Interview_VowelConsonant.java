package ex_13_Java_DoWhile;

import java.util.Scanner;

public class Lab_094_Interview_VowelConsonant {

    public static void main(String[] args) {

        System.out.println("Enter the character of vowel or consonant");

        Scanner scanner = new Scanner(System.in);
        char ch = scanner.next().toLowerCase().charAt(0);

        if (ch == 'a' || ch == 'e' || ch == 'i'|| ch == 'o' || ch == 'u'){
            System.out.println(ch + " is a vowel");
        }
        else if (ch >= 'a' && ch <= 'z'){
            //System.out.println(ch + " is a consonant");
        }

        else {
            System.out.println("Its a invalid character");
        }

    }
}
