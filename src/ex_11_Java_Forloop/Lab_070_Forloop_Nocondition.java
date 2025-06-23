package ex_11_Java_Forloop;

public class Lab_070_Forloop_Nocondition {

    public static void main(String[] args) {

        for(int i = 0; ; i++){
            System.out.println(i); // this will be infinite loop
        }

        // exit code 130 (stop by yourself-kill the program) Red button - interrupted by signal
        // exit code 0( successful)
    }
}
