package ex_35_Java_Exceptions;

public class Lab_260_TryCatch_multiple_exe2 {

    public static void main(String[] args) {

        System.out.println("Starting the program");

        try {
            String input_user = args[0];
            Integer ad = Integer.parseInt(input_user);
            Integer output = 100 / ad;
            System.out.println(output);
        }
        catch (ArrayIndexOutOfBoundsException | ArithmeticException | NumberFormatException e){
            System.out.println(e.getMessage());
        }

        System.out.println("End of the program");

    }


}
