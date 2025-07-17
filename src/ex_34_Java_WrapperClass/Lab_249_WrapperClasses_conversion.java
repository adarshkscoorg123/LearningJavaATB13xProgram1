package ex_34_Java_WrapperClass;

public class Lab_249_WrapperClasses_conversion {

    public static void main(String[] args) {

        int a = 10;
        Integer b = a;// This is called Boxing, Automatically JVM will store the value
                      // Primitive to wrapper class is called Autoboxing
        System.out.println(b.intValue()); // now b will have attributes and behaviour
        System.out.println(Integer.MAX_VALUE);

        Integer a2 = 42;
        int v = a2; // Unboxing-> wrapper is removed, attribute and behaviours are removed
        int c = 43;
        System.out.println(a2.equals(c));
        System.out.println(a2.floatValue());
        System.out.println(v);


    }


}
