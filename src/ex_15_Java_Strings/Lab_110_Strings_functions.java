package ex_15_Java_Strings;

public class Lab_110_Strings_functions {

    public static void main(String[] args) {

        String name = "Sonal";
        // length method
        System.out.println(name.length()); // 5
        System.out.println("-------");

        System.out.println(name.substring(1,4));

        // charAt method
        System.out.println(name.charAt(2)); // n
        System.out.println(name.charAt(3)); // a
        System.out.println(name.charAt(1)); // o
        System.out.println("--------");

        // Concat method
        System.out.println(name.concat("Patel"));
        System.out.println(name);
        System.out.println("-------");

        // Contains method

        System.out.println(name.contains("om")); // false
        System.out.println(name.contains("al")); // true
        System.out.println("------");

        // Equals method

        System.out.println(name.equals("Sonal"));
        System.out.println("--------");

        // EqualsIgnoreCase
        System.out.println(name.equalsIgnoreCase("Sonal"));
        System.out.println("------");

        // indexof()

        System.out.println(name.indexOf("o")); // 1
        System.out.println(name.indexOf("a")); // 3

        String s1 = "madam";
        // Returns the index within this string of the
        // first occurence of the specified substring

        System.out.println(s1.indexOf("a"));
        System.out.println(s1.indexOf("m"));
        System.out.println(s1.lastIndexOf("m"));

        // Replace
        System.out.println(s1.replace("m", "n"));

        // toLowerCase()
        System.out.println("SONAL".toLowerCase());

        // toUpperCase()
        System.out.println("sonal".toUpperCase());

        // startsWith()

        System.out.println(name.startsWith("S"));

        //endswith

        System.out.println(name.endsWith("l"));

        // Substring

        String anotherPalindrome = "Niagara. O roar again!";
        System.out.println(anotherPalindrome.length());
        String extract = anotherPalindrome.substring(11,15);
        System.out.println(extract);


        // exception
        //System.out.println(name.charAt(10)); // String out of bound exception

        StringBuilder sb = new StringBuilder("Adarsh");
        System.out.println(sb.append(" Suresh"));
        System.out.println(sb);

        String sa = "Hello";  // SCP
        System.out.println(sa.concat(" World"));
        System.out.println(sa);
    }
}
