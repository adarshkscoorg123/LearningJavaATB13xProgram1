package ex_33_Java_Enums;

public enum Lab_243_Locators {

    page_input_email("#login-username"),
    page_input_password("#login-password"),
    page_button("#btn");

    private String locators;

    Lab_243_Locators(String locators){
        this.locators = locators;
    }

    String getLocators(){
        return this.locators;
    }
}
