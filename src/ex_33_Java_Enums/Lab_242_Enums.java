package ex_33_Java_Enums;

public class Lab_242_Enums {

    public static void main(String[] args) {
        System.out.println(Day.FRIDAY);
        System.out.println(Project_names.restAssured);
        System.out.println(Day.SUNDAY);
        System.out.println(Project_names.google);
    }

}

enum Day{
    SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY
}

enum Project_names {
    google, restAssured, katalon, Vmo
}
