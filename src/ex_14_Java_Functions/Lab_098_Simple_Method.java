package ex_14_Java_Functions;

public class Lab_098_Simple_Method {

    static void pramod_f1(){
        System.out.println("No return");
    }

    static int return_int(){
        System.out.println("This is a normal function which returns something");
        return 20;
    }

    static boolean return_boolean(){
        return false;
    }

    static float return_float_pi_value(){
        return 3.14f;
    }

    static long return_long(){
        return 10l;
    }

    static String return_string(){
        return "Pramod";
    }

    public static void main(String[] args) {
        pramod_f1();
        int result_integer = return_int();
        boolean result_boolean = return_boolean();
        float result_float = return_float_pi_value();
        long result_long= return_long();
        String result_string = return_string();
        System.out.println(result_integer);
        System.out.println(result_boolean);
        System.out.println(result_float);
        System.out.println(result_long);
        System.out.println(result_string);

    }
}
