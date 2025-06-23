package ex_11_Java_Forloop;

public class Lab_080_Forloop_continue_even_numbers {

    public static void main(String[] args) {

        for (int i = 0; i <=50; i++) {
            if(i % 2 ==0){
                continue;
            }
            else{
                System.out.println("odd number -> " +i);
            }
        }
    }
}
