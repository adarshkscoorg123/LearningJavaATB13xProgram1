package ex_13_Java_DoWhile;

public class Lab_091_DoWhile_1 {

    public static void main(String[] args) {

        int a = 1;

        do {
            System.out.println("This is a body which will execute atleast 1 time");
            System.out.println(a);
            a++;
        } while (a < 10);
    }
}
