package ex_16_Stringbuffer_builder_functions;

public class Lab_113_StringBuffer {

    public static void main(String[] args) {

        StringBuffer stringbuffer = new StringBuffer("Pramod");

        // Append()
        stringbuffer.append(" Dutta");
        System.out.println(stringbuffer); // Pramod Dutta (since it is mutable)
        // Reverse()
        System.out.println(stringbuffer.reverse());

        String s1 = "Hello";
        String s2 = "World";
        String s3 = s1+s2; // creates a new string "Hello World"
        System.out.println(s3);
        System.out.println(s1);
    }
}
