package ex_17_Arrays;

public class Lab_134_Arrays_2d_Iterate_forLoop {

    public static void main(String[] args) {
        // Matrix means when the rows and columns are equal
        // for ex: 3 * 3 matrix, 2 * 2 matrix, 4 * 4 matrix
        // 1 * 2 , 2 * 3, 5 * 2 is not a matrix

        // 1, 2 ,3
        // 4, 5, 6
        // 7, 8, 9

        int[][] matrix1 = {
                           {1, 2, 3},
                           {4, 5, 6},
                           {7, 8, 9},
        };

        System.out.println(matrix1.length); // 3, gives the length of the row
        System.out.println(matrix1[0].length); // gives the length of the column of 1st row
        System.out.println(matrix1[1].length); // gives the length of the column of 2nd row
        System.out.println(matrix1[2].length); // gives the length of the column of 3rd row
        System.out.println("-----------");

        for (int i = 0; i < matrix1.length ; i++) {  // 0, 1, 2 // row length
            for (int j = 0; j < matrix1[i].length ; j++) { // columns length of the first row, 2nd row and 3rd row
                System.out.print(matrix1[i][j] + " | ");
                //System.out.print("*");   // It gives * pattern
            }
            System.out.println();
        }
    }
}
