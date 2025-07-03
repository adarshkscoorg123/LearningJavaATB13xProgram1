package ex_17_Arrays;

public class Lab_120_Arrays_2 {

    public static void main(String[] args) {
        // first way to create an array
        int[] marks = {1, 2, 3, 4, 5, 6};
        System.out.println(marks[0]);
        System.out.println(marks[1]);
        System.out.println(marks[3]);
        System.out.println(marks[4]);
        System.out.println(marks[5]);
        System.out.println(marks[2]);
        System.out.println("--------");

        int[] marks2 = new int[5];
        String[] names = new String[3];
        System.out.println(marks2.length);
        System.out.println(names.length);

        marks2[0]= 11;
        marks2[1]= 21;
        marks2[2]= 31;
        marks2[3]= 41;
        marks2[4]= 51;
        System.out.println(marks2[0]);
        System.out.println(marks2[3]);

        names[0]= "Adarsh";
        names[1]= "Amith";
        names[2]= "Engineer";

        System.out.println(names[2]);

    }
}
