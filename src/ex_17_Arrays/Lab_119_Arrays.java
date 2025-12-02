package ex_17_Arrays;

public class Lab_119_Arrays {

    public static void main(String[] args) {
        int a = 10;
        int[] marks = {91, 90, 51, 100, 91, 92, 89, 95};
        System.out.println(marks.length);
        System.out.println(marks[0]);
        System.out.println(marks[1]);
        System.out.println(marks[2]);
        System.out.println(marks[3]);
        System.out.println(marks[4]);
        System.out.println(marks[5]);
        System.out.println(marks[6]);
        System.out.println(marks[7]);
       // System.out.println(marks[10]); // Array index out of bounds exception

        boolean[] is_married = {true, false, true, true};
        System.out.println(is_married[0]);
        System.out.println(is_married[1]);
        System.out.println(is_married[2]);
        System.out.println(is_married[3]);
        System.out.println(is_married.length);

        char ch = 'A';
        String name = "Pramod";          // string is actually an array of characters

    }
}
