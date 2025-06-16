package ex_04_Java_typeCasting;

public class Lab_032_Typecasting_example2 {

    public static void main(String[] args) {

        int course = 100;
        float GST = 18.45f;

        //int total = course+GST; //Narrow - Impicit , which is not possible in this case
        int total = course+(int)GST;// Narrow - Explicit
        System.out.println(total);

        float total2 = course+GST; //Widening - auto - implicit
        float total3 = (float)course+GST; //Widening - Explicit

        System.out.println(total2);
        System.out.println(total3);

    }
}
