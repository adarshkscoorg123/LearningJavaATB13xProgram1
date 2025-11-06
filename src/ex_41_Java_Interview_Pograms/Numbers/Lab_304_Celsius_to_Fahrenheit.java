package ex_41_Java_Interview_Pograms.Numbers;

public class Lab_304_Celsius_to_Fahrenheit {

    public static void main(String[] args) {

        double celsius = 23.5;
        double fahrenheit = celsius * 9 / 5 + 32;

        System.out.println(celsius + "C = " + fahrenheit + "F");

        //Explanation: We apply the standard conversion formula.
        // Multiplying by 9/5 and adding 32 converts Celsius into Fahrenheit.
    }
}
