package ex_15_Java_Strings;

public class Lab_105_String_Immutable_example2 {

    public static void main(String[] args) {

        String s1 = "Hello";  // SCP
        s1.concat(" World");
        System.out.println(s1);

        s1 = s1.concat(" World");
        System.out.println(s1);

    }
}
