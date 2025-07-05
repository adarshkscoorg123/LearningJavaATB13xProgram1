package ex_17_Arrays;

public class Lab_131_Arrays_2D {

    public static void main(String[] args) {

        // 1 2 3
        // 4 5 6
        // 7 8 9

        // First way to create 2d array

        int[][] array1_2d = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };

        System.out.println(array1_2d[1][2]);

        // Second way to create 2d array

        // 10, 20
        // 30, 40
        // 50, 60

        int[][] array2_2d;
        array2_2d = new int[][] {
                {10,20},
                {30,40},
                {50,60}
        };

        System.out.println(array2_2d[1][1]);

        // Third way to create an array

        int[][] array3_2d = new int[3][3];
        // 3 * 3 matrix
        array3_2d[0][0] = 1; array3_2d[0][1] = 2; array3_2d[0][2] = 3;
        array3_2d[1][0] = 4; array3_2d[1][1] = 5; array3_2d[1][2] = 6;
        array3_2d[2][0] = 7; array3_2d[2][1] = 8; array3_2d[2][2] = 9;

        System.out.println(array3_2d[1][1]);
    }
}
