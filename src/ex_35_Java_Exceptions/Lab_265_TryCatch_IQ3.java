package ex_35_Java_Exceptions;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class Lab_265_TryCatch_IQ3 {

    public static void main(String[] args) {

        System.out.println("Starting");

        try {
            FileReader f1 = new FileReader("C://abc.txt");
        }
        catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }
        System.out.println("End");
    }
}
