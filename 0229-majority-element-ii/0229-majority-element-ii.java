import java.util.*;

class Solution {
    public List<Integer> majorityElement(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        List<Integer> result = new ArrayList<>();
        
        // Count frequency
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        
        // Check which elements appear more than n/3 times
        int threshold = nums.length / 3;
        
        for (int key : map.keySet()) {
            if (map.get(key) > threshold) {
                result.add(key);
            }
        }
        
        return result;
    }
}
