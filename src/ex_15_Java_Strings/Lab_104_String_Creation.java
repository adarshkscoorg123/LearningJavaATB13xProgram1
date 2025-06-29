package ex_15_Java_Strings;

public class Lab_104_String_Creation {

    public static void main(String[] args) {
        // String can be created in two ways
        String s1 = "pramod";   // s1 will be created in String Constant pool of Heap Area
        String s2 = new String("pramod"); // s2 will be created in Object area of Heap Area
        System.out.println(s1==s2); // References(Addresses are not equal)
        System.out.println(s1.equals(s2)); // but the values "Pramod" are equal
        System.out.println(s1);
        System.out.println(s2);
    }
}
