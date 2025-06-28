package ex_14_Java_Functions;

public class Lab_099_User_defined_method {

    static int sum_of_numbers(int a, int b){
        return a+b;
    }

    static void sum_of_numbers_no_return(int a, int b){
        System.out.println("sum of numbers is " + (a+b));
    }

    public static void main(String[] args) {
        int result = sum_of_numbers(3,4);
        System.out.println(result);
        sum_of_numbers_no_return(4,8);
    }
}
