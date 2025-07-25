package ex_40_Java_CollectionsFramework_Map;

import java.util.HashMap;
import java.util.Map;

public class Lab_296_CodingQuestion_FrequencyCounter_Char {

    public static void main(String[] args) {

        String input = "Programming";

        Map<Character, Integer> freqMap = new HashMap<Character, Integer>();

        for (char c : input.toCharArray()) {
            //p, r, o, g, r, a, m, m, i, n, g
            freqMap.put(c, freqMap.getOrDefault(c,0) +1);
        }
        System.out.println(freqMap);
    }
}