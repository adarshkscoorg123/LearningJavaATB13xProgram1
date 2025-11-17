package ex_250_Coding_Interview_Questions;

public class RightTraingleStar {

    public static void main(String[] args) {

        int n = 9;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
