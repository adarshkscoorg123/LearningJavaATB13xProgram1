package ex_37_Java_CollectionsFramework_List;

import java.util.ArrayList;
import java.util.Scanner;

public class Lab_283_User_Input_ArrayList {

    public static void main(String[] args) {

        // Multiple inputs from the user and store them in separate
        // names, ages - store them

        ArrayList<String> names = new ArrayList<String>();
        ArrayList<Integer> ages = new ArrayList<Integer>();
        Scanner scanner = new Scanner(System.in);

        String continueInput = "Y"; // control variable for input Loop

        while(continueInput.equalsIgnoreCase("Y")){

            System.out.println("Enter the name");
            String name = scanner.next();
            names.add(name);

            System.out.println("Enter the age");
            Integer age = scanner.nextInt();
            ages.add(age);

            scanner.nextLine();
            System.out.println("Do you want to enter another record? (Y/N): ");
            continueInput = scanner.nextLine();
        }

        for (Object o1: names){
            System.out.println(o1);
        }

        for (Object o2: ages){
            System.out.println(o2);
        }
        scanner.close();
    }
}
