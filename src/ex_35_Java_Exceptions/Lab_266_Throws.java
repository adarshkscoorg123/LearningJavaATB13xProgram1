package ex_35_Java_Exceptions;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Lab_266_Throws {

    public static void main(String[] args) {


    }

    // Throws is used with Methods
    // Try/ catch is used with blocks
    static void t() throws FileNotFoundException {
        FileInputStream fileInputStream = new FileInputStream("C://a.txt");
    }
}
