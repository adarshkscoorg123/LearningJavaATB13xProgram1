package ex_19_Java_Constructors;

public class BabyA_153 {

    // Instance variables

    String name;
    String aadhar_number;
    int year;
    int month;
    int day;

    // Constructor

    BabyA_153(){
        name = "Lucky";
        aadhar_number = "ABCD1234";
        year = 1985;
        month = 02;
        day = 5;
    }

    BabyA_153(String name, String aadhar_number, int year, int month, int day){
        this.name = name;
        this.aadhar_number= aadhar_number;
        this.year = year;
        this.month = month;
        this.day = day;
    }



}
