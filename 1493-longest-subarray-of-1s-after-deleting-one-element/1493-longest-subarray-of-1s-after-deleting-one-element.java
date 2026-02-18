// class Solution {
//     public int longestSubarray(int[] nums) {
//         int max = 0;
//         for (int i = 0; i < nums.length; i++) {
//             int zero = 0;
//             for (int j = i; j < nums.length; j++) {
//                 if (nums[j] == 0) zero++;
//                 if (zero > 1) break;
//             
//                 max = Math.max(max, j - i);
//             }
//         }
//         return max;
//     }
// }


//variable size sliding window

class Solution{
    public int longestSubarray(int[] nums){

        /*
[0,1,1,1,0,1,1,0,1]
zero=1
s=0 e=0
max=1

        */
        int zero=0;
        int s=0;
        int max=0;
        for(int e=0;e<nums.length;e++){
            if(nums[e]==0) zero++;
            while(zero>1){
                if(nums[s]==0)zero--;
                s++;
            }
            int size=e-s+1;
            max=Math.max(max,size);
        }
        return max-1;

    }
}