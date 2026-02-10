class Solution {
    public int singleNumber(int[] nums) {
        int ans = 0;
        for (int num : nums) {
            ans ^= num;
        }
        return ans;
    }
}


// other way of doing this question is : by using hashmap 
// frequency = 1 will be return

