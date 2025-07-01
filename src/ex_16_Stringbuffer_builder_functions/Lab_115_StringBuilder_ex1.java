package ex_16_Stringbuffer_builder_functions;

public class Lab_115_StringBuilder_ex1 {

    public static void main(String[] args) {

        StringBuilder sb = new StringBuilder("Hello");
        sb.append("World");
        sb.reverse();
        System.out.println(sb);  //dlroWolleH
    }
}
