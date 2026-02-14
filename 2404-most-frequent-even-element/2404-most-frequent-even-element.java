import java.util.*;

class Solution {
    public int mostFrequentEven(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int maxFreq = 0;
        int result = -1;

        for (int num : nums) {
            if (num % 2 == 0) {   // consider only even
                int freq = map.getOrDefault(num, 0) + 1;
                map.put(num, freq);

                if (freq > maxFreq) {
                    maxFreq = freq;
                    result = num;
                } else if (freq == maxFreq && num < result) {
                    result = num;
                }
            }
        }

        return result;
    }
}
