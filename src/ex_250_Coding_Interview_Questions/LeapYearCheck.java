package ex_250_Coding_Interview_Questions;

public class LeapYearCheck {

    public static void main(String[] args) {
        int year = 2029; // Replace with the year you want to check
        boolean isLeapYear = false;

        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            isLeapYear = true;
        }

        if (isLeapYear) {
            System.out.println(year + " is a leap year.");
        } else {
            System.out.println(year + " is not a leap year.");
        }
    }

}
