package ex_09_Java_IF;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class Lab_054_IF_condition {

    public static void main(String[] args) {

        System.out.println("Enter the age");
        Scanner scanner = new Scanner(System.in);
        int age = scanner.nextInt();

        if(age <= 18){
            System.out.println("Not allowed to vote");
        }

        else{
            System.out.println("Allowed to vote");
        }
    }


}
