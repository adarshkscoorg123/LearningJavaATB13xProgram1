package ex_14_Java_Functions;

import java.util.Scanner;

public class Lab_102_Method_Arithmetic {

    static int sum_of_numbers(int a , int b){
    return a + b;
    }

    static int subtract_of_numbers(int a, int b){
        return a - b;
    }

    static int multiply_of_numbers(int a, int b){
        return a * b;
    }

    static int division_of_numbers(int a, int b){
        if ( b == 0){

            throw new ArithmeticException(" b cant be zero");
            //System.out.println("b can't be zero");
            //System.exit(0);
        }
        return a / b;
    }

    static int mod_of_numbers(int a, int b){
        return a % b;
    }


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number 1");

        int a = 0;
        if(scanner.hasNextInt()){
            a = scanner.nextInt();
        }

        else{
            System.out.println("Enter the int only");
            //return;
            System.exit(0);
        }

        System.out.println("Enter the number 2");
        int b = 0;
        if(scanner.hasNextInt()){
            b = scanner.nextInt();
        }

        else{
            System.out.println("Enter the int only");
            //return;
            System.exit(0);
        }

        int result_sum = sum_of_numbers(a, b);
        System.out.println(result_sum);

        int result_sub = subtract_of_numbers(a, b);
        System.out.println(result_sub);

        int mul = multiply_of_numbers(a, b);
        System.out.println(mul);

        int div = division_of_numbers(a, b);
        System.out.println(div);

        int mod = mod_of_numbers(a, b);
        System.out.println(mod);

    }
}
