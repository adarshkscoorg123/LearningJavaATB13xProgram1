package ex_35_Java_Exceptions;

import java.util.Scanner;

public class Lab_268_Throw_ex2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your age");
        int age = sc.nextInt();
        try {
            validateAge(age);
            System.out.println("You can go to Goa");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    static void validateAge(int age) throws Exception {
        if(age < 18){
            throw new Exception("You are a minor, You can't go to Goa");
        }
    }
}
