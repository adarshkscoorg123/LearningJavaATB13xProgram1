package ex_16_Stringbuffer_builder_functions;

import java.util.Scanner;

public class Lab_118_Interview_VowelsConso_count {

    public static void main(String[] args) {
        // Java Program to count Vowels and Consonants
        // pramod -> a, e, i, o, u-> Vowels - a,o- 2   Consonants- p,r,m,d

        //Scanner scanner = new Scanner(System.in);
        //System.out.println("Enter the string input");
        //String input = scanner.next();
        String input = "Java Program to count vowels and consonants"; // 43-spaces are considered consonants

        int vowels = 0;
        int consonants = 0;

        input = input.toLowerCase();
        System.out.println(input);

        for(int i = 0; i < input.length();i++){
            char ch = input.charAt(i);

            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
                vowels++;
            }
            else{
                consonants++;
            }
        }
        System.out.println("number of vowels: " + vowels);
        System.out.println("number of consonants: " + consonants);
    }
}