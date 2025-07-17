package ex_33_Java_Enums;

public class Lab_244_Locators_main {

    public static void main(String[] args) {
        System.out.println(Lab_243_Locators.page_input_email.getLocators());
        System.out.println(Lab_243_Locators.page_input_password.getLocators());
        System.out.println(Lab_243_Locators.page_button.getLocators());
        System.out.println("-----------");

        System.out.println(Colors_245.GREEN.getHexCode());
        System.out.println(Colors_245.BLUE.getHexCode());
        System.out.println(Colors_245.YELLOW.getHexCode());
        System.out.println("------------");

        System.out.println(APIURLs_246.vwo.getUrl());
        System.out.println(APIURLs_246.katalon.getUrl());
        System.out.println(APIURLs_246.google.getUrl());

    }
}
