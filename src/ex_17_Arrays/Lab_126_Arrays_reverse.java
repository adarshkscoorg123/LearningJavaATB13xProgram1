package ex_17_Arrays;

public class Lab_126_Arrays_reverse {

    public static void main(String[] args) {

        int[] numbers = {1, 2, 3, 4, 5};
        // reverse - 5, 4, 3, 2, 1

        for (int i = numbers.length-1; i >= 0 ; i--) {
            System.out.println(numbers[i]);
        }
    }
}
