package ex_02_Java_Basics;

public class Lab_012_printf {

    public static void main(String[] args) {
        int a = 10;
        System.out.println("print command: print with the new line");
        System.out.print("Hello ");
        System.out.println("World");

        System.out.println(a);
        System.out.printf("Your variable name is %d",a);

        int b= 20;
        int c= a*b;
        System.out.println("----");
        System.out.printf("%d + %d",a,b);
        System.out.println(" ");
        System.out.println(c);
    }
}
