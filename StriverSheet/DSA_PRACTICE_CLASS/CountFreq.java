package DSA_PRACTICE_CLASS;

import java.util.HashMap;

public class CountFreq {
    public static void main(String[] args) {
        int[] arr = {2, 3, 2, 5, 3, 2};
        int maxFreq=3;

        HashMap<Integer, Integer> map = new HashMap<>();

// Step 1: Count Frequency
        for (int n : arr) {
            map.put(n, map.getOrDefault(n, 0) + 1);
        }


        for(int key:map.keySet()){
            if(map.get(key)>=maxFreq){
                System.out.println(key);
            }
        }
    }



    }

