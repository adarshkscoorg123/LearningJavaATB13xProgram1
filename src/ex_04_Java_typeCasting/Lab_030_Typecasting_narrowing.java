package ex_04_Java_typeCasting;

public class Lab_030_Typecasting_narrowing {

    public static void main(String[] args) {

        int value = 280;
     //   byte b = value; //Narrowing (int -> byte) - Implicit casting is not allowed
        byte b = (byte)value;

        System.out.println(b);
    }
}
