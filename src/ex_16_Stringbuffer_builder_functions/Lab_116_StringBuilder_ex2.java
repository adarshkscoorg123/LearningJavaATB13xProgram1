package ex_16_Stringbuffer_builder_functions;

public class Lab_116_StringBuilder_ex2 {

    public static void main(String[] args) {

        StringBuilder sb = new StringBuilder("Java");
        sb.append(" Programming");
        System.out.println(sb);

        // delete
        sb.delete(5, 16); // Delete the Substring(Programming)
        System.out.println(sb); // outputs Java
        sb.replace(0,4,"C++");
        System.out.println(sb);
    }
}
