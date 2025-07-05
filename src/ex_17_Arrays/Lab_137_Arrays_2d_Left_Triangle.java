package ex_17_Arrays;

public class Lab_137_Arrays_2d_Left_Triangle {

    public static void main(String[] args) {
        // left triangle
        int n = 4;
        for (int i = n; i >= 1 ; i--) {
            for (int j = 1; j <= i ; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
