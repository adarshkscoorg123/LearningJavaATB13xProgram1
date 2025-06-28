package ex_14_Java_Functions;

public class Lab_100_UserDefined_Allthefunctions {

    // User defined functions

    // Without parameters and without return type
    // Without parameters and with return type
    // With parameters and without return type
    // With parameters and with return type

    // First -> Without parameters and without return type. Definition

    static void wp_wr_greet(){
        System.out.println("Without parameters and without return types");
        System.out.println("Hi, How are you");
    }

    // Second -> Without parameters and with return type

    static String greet_with_hello_wp_with_RT() {

        System.out.println("Without parameters but with return types");
        System.out.println("wp with rt");
        return "Hi, How do you do";
    }

    // Third -> With parameters and without return type ( 50 % of the cases in automation)

    static void greet_with_details(String name, int age, double salary){
        System.out.println("Your name is ->" +name + "\nYour age is "  +age + "\nYour salary is " + salary);
    }

    // Fourth -> With parameters and with return type( 90 % of the cases are of 4th type)

    static int sum_of_two_numbers(int a, int b){
        return a+b;
    }

    static int sum_of_three_numbers(int c, int d, int e){
        return c+d+e;
    }


    public static void main(String[] args) {
        wp_wr_greet();
        String return_string = greet_with_hello_wp_with_RT();
        System.out.println(return_string);
        greet_with_details("Adarsh", 39, 86000);
        greet_with_details("Amith", 36, 84000);
        int sum = sum_of_two_numbers(4,5);
        int sum1= sum_of_two_numbers(45,55);
        int sum2= sum_of_three_numbers(1,2,3);
        int sum3= sum_of_three_numbers(100,46,90);

        System.out.println("Sum is " +sum);
        System.out.println("Sum1 is " +sum1);
        System.out.println("Sum2 is " +sum2);
        System.out.println("Sum3 is " +sum3);
    }


}


