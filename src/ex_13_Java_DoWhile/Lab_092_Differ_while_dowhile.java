package ex_13_Java_DoWhile;

public class Lab_092_Differ_while_dowhile {

    public static void main(String[] args) {

        // while loop

        int a = 0;

        while (a < 0){
            System.out.println(a);
            a++;
        }

        // Do while loop

        int b = 0;

        do {
            System.out.println("Value of b will be printed atleast one time " + b);
            b++;
        } while (b < 0);
    }
}
