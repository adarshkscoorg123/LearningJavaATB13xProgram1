package ex_15_Java_Strings;

public class Lab_practiceSessions {

    public static void main(String[] args) {

        String str1 = "Hello, world!";
        String str2 = "Hello, world!";
        if (str1.equals(str2)) {
            System.out.println("The two strings are equal");
        } else {
            System.out.println("The two strings are not equal");
        }

        String str3 = "HELLO, world!";
        String str4 = "hello, WORLD!";
        if (str3.equalsIgnoreCase(str4)) {
            System.out.println("The two strings are equal");
        } else {
            System.out.println("The two strings are not equal");
        }

        String str5 = "Hello, world!";
        String str6 = "Hello, world!";
        if (str5 == str6) {
            System.out.println("The two strings are equal");
        } else {
            System.out.println("The two strings are not equal");
        }

        System.out.println(str6);
    }
}
