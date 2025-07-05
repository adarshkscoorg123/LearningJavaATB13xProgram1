package ex_17_Arrays;

public class Lab_133_Arrays_2d_p0 {

    public static void main(String[] args) {

        int[][] matrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}, {10, 11, 12}}; // 4 * 3 matrix
        int[][] matrix_abc = {{1, 2}, {3, 4}}; // 2 * 2 matrix
        int[][] matrix_abcd = {{1}, {3}, {5}}; // 3 *1 matrix

        System.out.println(matrix.length); // 4, it gives the length of the row
        System.out.println(matrix_abc.length); // 2 ,it gives the length of the row
        System.out.println(matrix_abcd.length); // 3, it gives the length of the row

    }
}
