package ex_11_Java_Forloop;

public class LAb_078_forloop_break {

    public static void main(String[] args) {

        for (int i = 0; i < 50; i++) { // 0 to 49 times
            if(i==5){
                break;
            }
            else{
                System.out.println(i);
            }
        }
    }
}
