package ex_41_Java_Interview_Pograms.Numbers;

import java.util.Scanner;

public class Lab_303_Area_of_Rectangle {

    public static void main(String[] args) {
        int length = 5;
        int width = 2;
        int area = length * width;
        System.out.println("Area of rectangle: " + area);

        System.out.println("------------Part2-----------Using Scanner");

        int number1, number2;
        Scanner myObj = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Type a number:");
        number1 = myObj.nextInt(); // Read user input

        System.out.println("Type another number:");
        number2 = myObj.nextInt(); // Read user input

        int area_2 = number1 * number2;
        System.out.println("Area of a rectangle :" +area_2);

//        Explanation: We store the rectangle's length and width in two variables.
//        Then we multiply them (length * width) to get the area.
//        Finally, we print the result, which in this example is 10.
    }

    }

