// class Solution {
//     public int minSubArrayLen(int target, int[] nums) {
//         int min = Integer.MAX_VALUE;
//         for(int i=0;i<nums.length;i++){
//             int sum=0;
//             for(int j=i;j<nums.length;j++){
//                 sum+=nums[j];
//                 if(sum>=target){
//                     min=Math.min(min,j-i+1);
//                     break;
//                 }
//             }
//         }
//         // ternary operator
//         return min==Integer.MAX_VALUE? 0:min;
//     }
// }




// solving my varible size sliding window.

class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int min=Integer.MAX_VALUE;
        int sum=0;
        int s=0;
        for(int e=0;e<nums.length;e++){
            sum += nums[e];
            while(sum>=target){
                min=Math.min(min,e-s+1);
                sum-=nums[s++];
            }
        }
        return min==Integer.MAX_VALUE? 0:min;
    }
}

