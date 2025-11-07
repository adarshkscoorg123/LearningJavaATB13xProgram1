package ex_15_Java_Strings;

public class Lab_106_Strings_Methods {

    public static void main(String[] args) {
        char c = 'A';
        System.out.println(c);

        String s1 = "AbCd";
        System.out.println(s1);
        System.out.println(s1.length());
        System.out.println(s1.toUpperCase());
        System.out.println(s1.toLowerCase());
        System.out.println(s1.concat("E"));
        System.out.println(s1);
        String replace = s1.replace('A','N');
        System.out.println(replace);


    }
}
