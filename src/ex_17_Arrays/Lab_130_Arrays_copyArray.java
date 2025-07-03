package ex_17_Arrays;

public class Lab_130_Arrays_copyArray {

    public static void main(String[] args) {

        int[] original = {10, 25, 32, 48, 86 };
        int[] copy = new int[original.length];
        System.arraycopy(original, 0, copy, 0, original.length);
        System.out.println(copy[4]);
    }
}
