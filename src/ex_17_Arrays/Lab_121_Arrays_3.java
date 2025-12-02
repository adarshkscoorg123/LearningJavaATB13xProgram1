package ex_17_Arrays;

public class Lab_121_Arrays_3 {

    public static void main(String[] args) {

        String[] names = {"Pramod", "Adarsh", "Amith"};
        // length-> denotes length of an array
        System.out.println(names.length);
        System.out.println(names[0]);
        System.out.println(names[2]);
        System.out.println(names[1]);

        // length()- denotes length of the string
        String name2 = "Sairam123";
        System.out.println(name2.length());

        boolean[] is_male_data = new boolean[2];
        is_male_data[0]= true;
        is_male_data[1]= false;

        System.out.println(is_male_data[1]);

    }
}
