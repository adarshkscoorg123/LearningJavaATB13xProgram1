package ex_11_Java_Forloop;

public class Lab_073_Forloop_longfloat {

    public static void main(String[] args) {
        // note - Both long and float can be used in for loop, but it is not advisable
        for(long i = 1l; i < 10; i++){
            System.out.println(i);
        }

        for(float f = 0.0f; f < 10.67; f++){
            System.out.println("Hi, float -> " + f);
        }


    }
}
