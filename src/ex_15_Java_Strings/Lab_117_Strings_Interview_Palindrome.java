package ex_15_Java_Strings;

import java.util.Scanner;

public class Lab_117_Strings_Interview_Palindrome {

        public static void main(String[] args) {
            // Palindrome
            // madam -> reverse (madam) -> madam
            // s1 = madam
            // s1_reverse = madam
            // s1 == s1_reverse
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter the string");
            String input = scanner.next();
            String newString_reversed = reverseString(input);

            if(newString_reversed.equalsIgnoreCase(input)){
                System.out.println("Its a Palindrome");
            }
            else{
                System.out.println("Its not a Palindrome");
            }

        }

    static String reverseString(String userInput){
        String reversed = "";
        for (int i = userInput.length()-1; i >= 0 ; i--) {
            reversed = reversed + userInput.charAt(i); //madam
        }
        return reversed;

    }
    }

