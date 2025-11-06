package ex_15_Java_Strings;

import java.util.Arrays;

public class Lab_practiceSessions_4 {

    public static void main(String[] args) {

        String str = "Hello, world!";
        StringBuilder sb = new StringBuilder(str);
        String reversedStr = sb.reverse().toString();
        System.out.println("The original string is: " + str);
        System.out.println("The reversed string is: " + reversedStr);

        String str1 = "Hello, world!";
        char[] charArray = str1.toCharArray();
        int i = 0, j = charArray.length - 1;
        while (i < j) {
            char temp = charArray[i];
            charArray[i] = charArray[j];
            charArray[j] = temp;
            i++;
            j--;
        }
        String reversedStr1 = new String(charArray);
        System.out.println("The original string is: " + str);
        System.out.println("The reversed string is: " + reversedStr1);

        String str2 = "Hello, world!";
        char[] charArray1 = str2.toCharArray();
        System.out.println(charArray1[2]);
        System.out.println("The original string is: " + str2);
        System.out.println("The character array is: " + Arrays.toString(charArray1));

        String str4 = "Universal";
        str4 = str4 + " Power"; // creates a new String object

        System.out.println(str4);

        StringBuffer sb1 = new StringBuffer("Hello");
        sb1.append(" World"); // modifies the existing StringBuffer object
        System.out.println(sb1.toString());
    }
}
