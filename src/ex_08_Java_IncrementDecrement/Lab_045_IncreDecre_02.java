package ex_08_Java_IncrementDecrement;

public class Lab_045_IncreDecre_02 {

    public static void main(String[] args) {

        int a = 10;
        System.out.println(++a);
        System.out.println(a);

        // Post increment = Print first and then increase

        int a_post = 10;
        System.out.println(a_post++); // value is 10
        System.out.println(a_post);   // value is 11

        //line no  |  a_post | print |
        //    13   |    10   |   na  |
        //    14   |    11   |   10  |
        //    15   |    11   |    NA |


    }
}
