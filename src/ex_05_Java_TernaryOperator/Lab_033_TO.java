package ex_05_Java_TernaryOperator;

public class Lab_033_TO {

    public static void main(String[] args) {
        //Age to vote ?

        int age = 65;
        String canIVote = age >= 18 ? "Yes" : "No, You can't vote";
        System.out.println(canIVote);
    }
}
