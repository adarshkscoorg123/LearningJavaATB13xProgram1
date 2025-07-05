package ex_17_Arrays;

public class Lab_132_Arrays_JaggedArrays {

    public static void main(String[] args) {

        int[][] jaggedArray = {
                {1, 2, 3},
                {4, 5, 6, 9},
                {7}
        };

        System.out.println(jaggedArray[0][2]);
        System.out.println(jaggedArray[1][3]);
        System.out.println(jaggedArray[2][0]);
        System.out.println(jaggedArray.length); // gives 3 output
        System.out.println(jaggedArray[0].length); // gives 3 which is the length of column
        System.out.println(jaggedArray[1].length); // gives 4 which is the length of column
        System.out.println(jaggedArray[2].length); // gives 1 which is the length of column


    }
}
