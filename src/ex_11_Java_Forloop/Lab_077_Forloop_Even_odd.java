package ex_11_Java_Forloop;

public class Lab_077_Forloop_Even_odd {

    public static void main(String[] args) {
        // find the even numbers from 1 to 50
        for (int i = 0; i <= 50; i++) {

            if(i%2 == 0){
                System.out.println("Even -> " +i);
            }
            else{
                System.out.println("Odd number ->" +i);
            }

        }
    }
}
