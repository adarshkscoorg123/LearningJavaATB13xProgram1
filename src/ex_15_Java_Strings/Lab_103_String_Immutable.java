package ex_15_Java_Strings;

public class Lab_103_String_Immutable {

    public static void main(String[] args) {
        // The below statements explains about String Immutability
        String name = "Pramod";  // This "Pramod" will be stored in String Constant pool
        System.out.println(name.toUpperCase()); // Only here the value of name will be changed to PRAMOD
        //name = name.toUpperCase(); // Once it is assigned the value of name will be changed to PRAMOD
        System.out.println(name);// Unless it is assigned, the value of original will be present which is "Pramod", in this case
    }
}
