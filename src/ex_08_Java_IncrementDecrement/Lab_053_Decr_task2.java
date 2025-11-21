package ex_08_Java_IncrementDecrement;

public class Lab_053_Decr_task2 {

    public static void main(String[] args) {

        int i = 1;   // i = 1
        i = i++ + ++i;   // i++ -> 1   i= 2,  ++i-> 3    1 + 3= 4
        System.out.println(i);



        int x = 5;    // x = 5
        System.out.println(x++ + ++x);  // x++ -> 5  x= 6  ++x-> 7  so value will be 5 + 7 = 12
        System.out.println(x); // x = 7



        int y = 5; // y = 5
        int z = y++ + ++y + y++ + ++y; // y++ -> 5 y = 6 ++y-> 7   y++-> 7 y = 8 ++y-> 9
        // 5 + 7 + 7 + 9= 28
        System.out.println(z);
        System.out.println(y);




    }
}
