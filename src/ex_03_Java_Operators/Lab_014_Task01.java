package ex_03_Java_Operators;

public class Lab_014_Task01 {

    public static void main(String[] args) {

        int num = 6;
//First way of solving the task

        /*System.out.printf("%d * %d = %d", 9,1,9).println();
        System.out.printf("%d * %d = %d", 9,2,18).println();
        System.out.printf("%d * %d = %d", 9,3,27).println();
        System.out.printf("%d * %d = %d", 9,4,36).println();
        System.out.printf("%d * %d = %d", 9,5,45).println();
        System.out.printf("%d * %d = %d", 9,6,54).println();
        System.out.println("-----");
        System.out.printf("%d * %d = %d", 9, 10, 90).println();*/

//Second way of solving the task
        System.out.printf("%d * %d = %d", num,1,num).println();
        System.out.printf("%d * %d = %d", num,2,num*2).println();
        System.out.printf("%d * %d = %d", num,3,num*3).println();
        System.out.printf("%d * %d = %d", num,4,num*4).println();
        System.out.printf("%d * %d = %d", num,5,num*5).println();
        System.out.printf("%d * %d = %d", num,6,num*6).println();
        System.out.println("-----");
        System.out.printf("%d * %d = %d", num, 10, num*10).println();
    }
}
