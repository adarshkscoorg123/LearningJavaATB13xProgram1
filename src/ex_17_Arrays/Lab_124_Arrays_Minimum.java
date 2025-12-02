package ex_17_Arrays;

public class Lab_124_Arrays_Minimum {

    static int give_me_min(int[] arrayinput){
        int min = arrayinput[0];
        for (int i = 0; i < arrayinput.length; i++) {
            if(arrayinput[i] < min){
                min = arrayinput[i];
        }
        }
        return min;
    }

    public static void main(String[] args) {

        int[] array2 = {25, 14, 56, 15, 36, 12, 9,77, 18, 29, 49};

        int min_output = give_me_min(array2);
        System.out.println(min_output);
    }
}
