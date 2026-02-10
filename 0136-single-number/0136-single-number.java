// with simple xor methord'

// class Solution {
//     public int singleNumber(int[] nums) {
//         int ans = 0;
//         for (int num : nums) {
//             ans ^= num;
//         }
//         return ans;
//     }
// }


// other way of doing this question is : by using hashmap 
// frequency = 1 will be return





// doing this question by hashmap.
import java.util.HashMap;

class Solution {
    public int singleNumber(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i : nums) {
            map.put(i, map.getOrDefault(i, 0) + 1);
        }

        for (int key : map.keySet()) {
            if (map.get(key) == 1) {
                return key;
            }
        }

        return -1; // fallback (won't hit as per problem constraints)
    }
}
