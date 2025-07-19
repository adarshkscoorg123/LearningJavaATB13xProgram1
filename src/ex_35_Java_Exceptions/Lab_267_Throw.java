package ex_35_Java_Exceptions;

public class Lab_267_Throw {

    public static void main(String[] args) {


    }

    static void divideByZero(int a){
        if(a == 0){
            throw new ArithmeticException("Error == 0");
        }
    }
}
