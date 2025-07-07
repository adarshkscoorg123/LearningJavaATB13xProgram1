package ex_19_Java_Constructors;

public class Baby_146 {

    String name; // Instance variables/ member variables/ attributes

    // Default constructor


    Baby_146(){
        System.out.println("Hi, I am a default constructor");
        System.out.println("Baby's Aadhar card is created");

        // What is the use of a constructor in Automation
        // 1. Fetch data from MYSQL/SQLServer database
        // 2. Read from CSV file, xlsx
        // 3. Open a file and read the data .(json, testdata.xlsx, txt file
    }

    // Behaviour/Methods/Properties
        void cry(){
            System.out.println("Cry");
        }

        void sleep(){
            System.out.println("Sleep");
        }

        void eat(){
            System.out.println("Eat");
        }

}
