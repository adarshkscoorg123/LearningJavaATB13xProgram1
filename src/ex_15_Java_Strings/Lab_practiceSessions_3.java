package ex_15_Java_Strings;

public class Lab_practiceSessions_3 {

    public static void main(String[] args) {
        String str = "  Hello, world! ";
        String strTrimmed = str.trim(); // it removes whitespace from the string
        System.out.println("The original string is: " + str);
        System.out.println("The trimmed string is: " + strTrimmed);

        String str1 = "The quick brown fox jumps over the lazy dog";
        String[] words = str1.split(" ");
        System.out.println("The original string is: " + str1);
        System.out.println("The words in the string are:");
        for (String word : words) {
            System.out.println(word);
        }

        String str2 = "The quick brown fox jumps over the lazy dog";
        String newStr = str2.replace("quick", "slow");
        System.out.println("The original string is: " + str2);
        System.out.println("The new string is: " + newStr);

        String str3 = "The quick brown fox jumps over the lazy dog";
        String newStr1 = str3.replaceAll("o", "X");

        System.out.println("The original string is: " + str3);
        System.out.println("The new string is: " + newStr1);

        String str4 = "The quick brown fox jumps over the lazy dog";
        if (str4.contains("adarsh")) {
            System.out.println("The string contains the substring 'quick'");
        } else {
            System.out.println("The string does not contain the substring 'quick'");
        }
    }

}
