package ex_35_Java_Exceptions;

public class Lab_254_String_NullPointer {

    public static void main(String[] args) {

        String name = null;
        name.trim(); // Null pointer exception
    }
}
