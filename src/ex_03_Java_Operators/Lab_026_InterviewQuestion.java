package ex_03_Java_Operators;

public class Lab_026_InterviewQuestion {

    public static void main(String[] args) {
//Interview question 1
        long l = 10l; // 8 byte = 64 bits
        String s = "Adarsh";// 8 byte = 64 bits

        char a1 = 'A'; //65 - ASCII value
        char b1 = 'B';// 66 - ASCII value
        System.out.println(a1+b1);
//Interview question 2
        System.out.println('A'== 65);

        short s1 = 10;
        char c = 'A';//ASCII value
        String s2 = "A";
        System.out.println(c+s1);
        System.out.println(c);
        System.out.println(c+c);
        System.out.println(c+s2);
    }
}
