package ex_08_Java_IncrementDecrement;

public class Lab_044_IncreDecre_01 {

    public static void main(String[] args) {

        int a = 10;
        int b = ++a;

        System.out.println(a);
        System.out.println(b);

        //Exp and result table
        // Line no  | a |  result b
        //  7       | 10 | NA
        //  8       | 11 | 11
        // 10       | 11 | NA
        // 11       | 11 | 11
    }
}
