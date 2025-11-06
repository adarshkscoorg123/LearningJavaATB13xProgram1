package ex_15_Java_Strings;

public class Lab_108_Strings_Interviewquestion_2 {

    public static void main(String[] args) {

        String s1 = "Hello"; // 1 string is present in String constant pool
        String s4 = "Hello"; // still 1 string is present in String constant pool, since both have same addresses(references)
        String s10 = "Hello"; // still 1 string is present in String constant pool
        String s11 = "HELLO";
        System.out.println(s1==s4);// Here references are equal since both point to same in string constant pool
        System.out.println(s1.equals(s4)); // Here values are also equal
        System.out.println(s4==s10); // Here references are also equal
        System.out.println("--------");

        System.out.println(s4==s11); // here references are not equal
        System.out.println(s4.equals(s11));// here values are also not equal

        System.out.println("---------");

        String s2 = new String("Hello");// created in object Area
        String s3 = new String("Hello");// created in object Area
        String s5 = new String("World");// created in object Area

        // SCP - 1 value
        // OA- 3 values
        System.out.println(s2==s3);  // false
        System.out.println(s2.equals(s3)); // true
        System.out.println(s3==s5);    // false
        System.out.println(s3.equals(s5)); // false
        System.out.println(s5);

    }
}
