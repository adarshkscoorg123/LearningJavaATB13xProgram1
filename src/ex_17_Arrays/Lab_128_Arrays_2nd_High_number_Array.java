package ex_17_Arrays;

import java.util.Arrays;

public class Lab_128_Arrays_2nd_High_number_Array {

    public static void main(String[] args) {
        // Find Second-Largest Number in an Array

        int[] numbers = { 12, 34, 10, 1, 100, 3, 4, 32};
        // 100, 34

        Arrays.sort(numbers);
        System.out.println(numbers[numbers.length-2]);
    }
}
