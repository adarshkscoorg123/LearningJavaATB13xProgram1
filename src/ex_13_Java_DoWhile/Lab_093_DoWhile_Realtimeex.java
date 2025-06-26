package ex_13_Java_DoWhile;

public class Lab_093_DoWhile_Realtimeex {

    public static void main(String[] args) {

        // Web automation
        int number = 0;
        // 0 -> it can be 0 to 10 - elements or students

        do {
            System.out.println(number);
            // callFunction(number);
            // close the excel file, open the file etc...
            number++;
        } while ( number < 0);
    }
}
