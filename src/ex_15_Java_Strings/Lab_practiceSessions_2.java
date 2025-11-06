package ex_15_Java_Strings;

public class Lab_practiceSessions_2 {

    public static void main(String[] args) {
        String str = "7896";
        String str1 ="adarsh";
        System.out.println(str);
        int num2 = 56789;
        try {
            int num = Integer.parseInt(str);
            System.out.println(num);
            int result = num+num2;
            System.out.println(result);
        }
        catch (NumberFormatException e){
            System.out.println("The string does not contain a valid integer value");
        }


        String result2 = str+ str1;
        System.out.println(result2);

    }

}
