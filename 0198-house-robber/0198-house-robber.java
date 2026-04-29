class Solution {
    public int rob(int[] nums) {
        int n = nums.length;
        if(nums ==null || n==0) return 0;
        if(n == 1) return nums[0];
        if(n==2) return Math.max(nums[0],nums[1]);

        int dp[]=new int[n];
        dp[0]=nums[0];
        dp[1]=Integer.max(nums[1],nums[0]);
        for(int i=2;i<n;i++){
            dp[i]=Integer.max(nums[i]+dp[i-2],dp[i-1]);
        }
        return dp[n-1];
    }
}


//TLE
// class Solution {
//     public int rob(int[] nums) {
//         return fun(nums, 0);
//     }

//     int fun(int nums[], int i){
//         if(i >= nums.length) return 0;

//         int a1 = nums[i] + fun(nums, i + 2); 
//         int a2 = fun(nums, i + 1);           

//         return Math.max(a1, a2);
//     }
// }