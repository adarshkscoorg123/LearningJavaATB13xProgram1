package ex_17_Arrays;

public class Lab_123_Arrays_Maximum {

    // Second way to sort any array

    static int give_me_max(int[] arrayinput){
        //logic
        int max = arrayinput[0];
        for (int i = 0; i < arrayinput.length; i++) {
            if (arrayinput[i] > max){
                max = arrayinput[i];
            }
        }
        return max;
    }

    public static void main(String[] args) {
    // find the maximum element in the array

        int[] array = {25, 14, 56, 15, 36, 55, 77, 88, 29, 49};

        // first way to sort the array

        //Arrays.sort(array); // 14, 15..................77
        //System.out.println(array[array.length - 1]);
        System.out.println("--------");
        // second way
        int max_output = give_me_max(array);
        System.out.println(max_output);
    }

}
