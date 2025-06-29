package ex_15_Java_Strings;

public class Lab_109_Strings_Interviewquestion_3 {

    public static void main(String[] args) {

        String s1 = "Hello";
        String s4 = "Hello"; // SCP -> 1

        String s2 = new String("Hello");// created in object Area
        String s3 = new String("Hello");// created in object Area
        String s5 = new String("hello");// created in object Area //So total in OA- 3

        // == > Comparison -> String -> this checks the locations ref
        System.out.println(s1 == s3); // false
        System.out.println(s1 == s2); // false
        System.out.println(s2 == s3); // false
        System.out.println(s1 == s4); // true
        System.out.println(s3 == s5); // false
        System.out.println("--------------");

        // equals ( content ) -> value
        System.out.println(s1.equals(s2)); // true
        System.out.println(s1.equals(s3)); // true
        System.out.println(s3.equals(s5)); // false
        System.out.println(s3.equalsIgnoreCase(s5)); // true

        // Note :
        // == -> Check for the reference
        // =  -> assignment of the values
        // equalsIgnoreCase -> ignores the upper case or lower case
        // equals            -> compares the values



    }
}
