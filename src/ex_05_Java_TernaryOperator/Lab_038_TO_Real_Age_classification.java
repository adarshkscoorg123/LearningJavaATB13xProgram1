package ex_05_Java_TernaryOperator;

public class Lab_038_TO_Real_Age_classification {

    public static void main(String[] args) {
        //age = 23;
        //age < 18 -> minor
        // 18 < age  > 65  > Adult
        //age  > 65  > Senior citizen
        int age = 75;
        String result =  (age < 18) ? "Minor" : (age < 65 ) ? "Adult" : "Senior";
        System.out.println(result);
    }
}
