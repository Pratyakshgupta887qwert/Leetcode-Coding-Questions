// class Solution {
//     public int numSubarrayProductLessThanK(int[] nums, int k) {
//         int count =0;
//         for (int i=0;i<nums.length;i++){
//             int p= 1;
//             for(int j=i;j<nums.length;j++){
//                 p*=nums[j];
//                 if(p>=k)break;
//                 count++;

//             }
//         }
//         return count;
//     }
// }




// sliding window
class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        if (k <= 1) return 0;
        int count = 0;
        int product = 1;
        int left = 0;
        for (int right = 0; right < nums.length; right++) {
            product *= nums[right];
            while (product >= k && left <= right) {
                product /= nums[left];
                left++;
            }
            count += (right - left + 1);
        }
        return count;
    }
}
