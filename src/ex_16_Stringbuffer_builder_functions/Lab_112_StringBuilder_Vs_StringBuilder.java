package ex_16_Stringbuffer_builder_functions;

public class Lab_112_StringBuilder_Vs_StringBuilder {

    public static void main(String[] args) {

        String s0 = "Pramod";
        String s1 = new String("Pramod");

        StringBuilder stringbuilder = new StringBuilder("Pramod");
        StringBuffer stringbuffer = new StringBuffer("Pramod");

        System.out.println(s0);
        System.out.println(s1);
        System.out.println(stringbuilder);
        System.out.println(stringbuffer);
    }

}
