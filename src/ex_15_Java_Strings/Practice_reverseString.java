package ex_15_Java_Strings;

public class Practice_reverseString {

    public static void main(String[] args) {

        String input = "Pramod Sir is Owner of TheTestingAcademy";
        System.out.println("The original String is :"+input);
        StringBuilder input1 = new StringBuilder("Adarsh says "); // append a string into StringBuilder input1
        input1.append(input);// reverse StringBuilder input1
        System.out.println("The appended string is :"+input1);
        input1.reverse(); // print reversed String
        System.out.println(input1);
    }
}
