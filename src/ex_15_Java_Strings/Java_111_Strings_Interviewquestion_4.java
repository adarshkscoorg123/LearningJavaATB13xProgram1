package ex_15_Java_Strings;

public class Java_111_Strings_Interviewquestion_4 {

    public static void main(String[] args) {

        String str1 = "Hello";
        String str2 = "Hello";
        String str3 = new String ("Hello");
        System.out.println(str1 == str2);   // true
        System.out.println(str1 == str3);   // false
        System.out.println(str1.equals(str3)); // true
        int length = str1.length();
        System.out.println(length);

    }
}
