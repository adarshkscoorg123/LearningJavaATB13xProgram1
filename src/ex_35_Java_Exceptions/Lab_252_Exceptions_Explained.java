package ex_35_Java_Exceptions;

public class Lab_252_Exceptions_Explained {

    public static void main(String[] args) {

        System.out.println("Starting the program");
        String input_user = args[0];
        Integer ad = Integer.parseInt(input_user);
        Integer output = 100/ad;
        System.out.println(output);
        System.out.println("End of the program");

        // divide by zero - Arithmetic exception when args -> 0
        // NumberformatException: for using "Pramod" as input value which is string
        // ArrayIndexOutOfExceptions- when not giving any input

    }



}
