// /*
// Kadane's Algorithm.
// */


// class Solution {
//     public int maxSubArray(int[] nums) {
//         int max=Integer.MIN_VALUE;
//         for(int i=0;i<nums.length;i++){
//             int sum=0;
//             for(int j=i;j<nums.length;j++){
//                 sum+=nums[j];
//                 max=Math.max(max,sum);
//             }
//         }
//         /*
//     Subarray of [1,4,6,7]
//     1
//     1,4
//     1,4,6
//     1,4,6,7
//     4
//     4,6
//     4,6,7
//     6
//     6,7
//     7
//         */
//         return max;

//     }
// }


class Solution {

    public int maxSubArray(int[] nums) {
        int sum = 0;
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            max = Math.max(max, sum);

            if (sum < 0) {
                sum = 0;
            }
        }

        return max;
    }

}
