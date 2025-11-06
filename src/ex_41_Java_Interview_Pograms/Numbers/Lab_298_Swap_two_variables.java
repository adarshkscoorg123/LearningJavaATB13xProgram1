package ex_41_Java_Interview_Pograms.Numbers;

public class Lab_298_Swap_two_variables {

    public static void main(String[] args) {
        int a1 = 5;
        int b1 = 10;

        int temp = a1;
        a1 = b1;
        b1 = temp;

        System.out.println("a = " + a1 + ", b = " + b1);

//        Explanation: We save a1 in a temporary variable, move b into a1,
//        and then move the saved value into b.
    }
}
