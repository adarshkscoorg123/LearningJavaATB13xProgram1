package ex_41_Java_Interview_Pograms.Numbers;

public class Lab_300_Reverse_a_number {

    // Note: This Problem is not solved - need to revisit at the last

    public static void main(String[] args) {

        int num = 1234;
        int reversed = 0;

        while (num != 0) {
            int digit = num % 10;
            reversed = reversed * 10 + digit;
            num /= 10;
        }

        System.out.println("Reversed: " + reversed);

//        Explanation: We start with the number 1234. Inside the loop:
//        - num % 10 gives us the last digit (4, then 3, then 2, then 1).
//        - We add this digit to reversed, making the new number grow step by step.
//        - num /= 10 removes the last digit from the original number.
//        When the loop finishes, reversed contains 4321.


    }
}
