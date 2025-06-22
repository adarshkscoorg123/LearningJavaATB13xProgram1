package ex_10_Java_Switch;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Lab_057_Real_Switch_Automation {

    public static void main(String[] args) {
        // Web Automation
        // I will ask the user to give me the input from browser which he wants to
        // use to i will start the automation in that

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the browser,which you want to start");
        String browser = scanner.next();
        browser = browser.toUpperCase();

        switch (browser){

            case "CHROME":
                System.out.println("Starting the chrome");
                System.out.println(".........");
                System.out.println("TC1");
                System.out.println("TC2");
                break;

            case "FIREFOX":
                System.out.println("Starting the firefox browser");
                break;
                // Further code to start the Firefox

            case "EDGE":
                System.out.println("Start the edge browser");
                break;

            default:
                System.out.println("I have no idea which browser is this");
                break;

        }



    }
}
