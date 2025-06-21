package ex_08_Java_IncrementDecrement;

public class Lab_048_IncreDec_Post3 {

    public static void main(String[] args) {

        int a = 10;  // a = 10
        System.out.println(a++ + ++a); // a++ -> 10   a -> 11   ++a -> 12  10 + 12= 22
        System.out.println(a);
    }
}
