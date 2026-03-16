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
        int count=0;
        int p=1;
        int s=0;
        for(int e=0;e<nums.length;e++){
            p*=nums[e];
            while(s<=e && p>=k){
                p/=nums[s++];
            }
            count+=e-s+1;
        }
        return count;
    }
}
