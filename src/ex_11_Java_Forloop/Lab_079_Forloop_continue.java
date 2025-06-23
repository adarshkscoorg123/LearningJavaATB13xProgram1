package ex_11_Java_Forloop;

public class Lab_079_Forloop_continue {

    public static void main(String[] args) {

        for (int i = 0; i < 50; i++) {

            if(i==5){
                continue; // skip the code and move to next to top
            }
            System.out.println(i);

        }
    }


}
