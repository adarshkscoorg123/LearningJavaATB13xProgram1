package ex_05_Java_TernaryOperator;

public class Lab_39_TO_max_between_three {

        public static void main(String[] args)
        {
         // find the maximum between three numbers
         // Now we will be using the log building formula


            // Step 1 : Find input / outputs
            // I/O -> n1, n2,n3 - int
            // O/p -> String -> max number

            int n1 = -55;
            int n2 = 99;
            int n3 = 18;

            //Step 2 - rough logic, think about it
            // n1 > n2 and n1 > n3 -> n1 is the maximum
            // n2 > n3 and n2 > n1 -> n2 is the maximum
            // else - n3 is the maximum

            // step 3
            // int max = (n1 > n2) ? A : B;
            // A -> (n1 > n3) ? n1 : n3
            // B -> (n2 > n3) ? n2 : n3

            int max = (n1 > n2) ? (n1 > n3) ? n1 : n3 : (n2 > n3) ? n2 : n3;

            System.out.println(max);

        }




}
