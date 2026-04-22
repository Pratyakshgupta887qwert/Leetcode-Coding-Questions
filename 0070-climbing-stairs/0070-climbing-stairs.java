// class Solution {
//     public int climbStairs(int n) {
//         return fun(0,n);
//     }

//     int fun(int i,int n){
//         if(i==n) return 1;
//         if(i>n) return 0;
//         int ways1=fun(i+1,n);
//         int ways2=fun(i+2,n);
//         return ways1+ways2;
//     }
// }






// DP 
// class Solution {
//     public int climbStairs(int n) {
//         int dp[] = new int[n+1];
//         return fun(0, n, dp);
//     }

//     int fun(int i, int n, int dp[]){
//         if(i == n) return 1;
//         if(i > n) return 0;
//         if(dp[i] != 0) return dp[i];
//         int ways1 = fun(i+1, n, dp);
//         int ways2 = fun(i+2, n, dp);
//         return dp[i] = ways1 + ways2;
//     }
// }






// class Solution {
//     public int climbStairs(int n) {
//         return fun(n);
//     }
//     int fun(int n){
//         if(n==0) return 1;
//         if(n==1) return 1;
//         return fun(n-1) + fun(n-2);
//     }
// }




class Solution {
    public int climbStairs(int n) {
        int dp[] = new int[n+1];
        return fun(n, dp);
    }
    int fun(int n, int dp[]){
        if(n==0) return 1;
        if(n==1) return 1;
        if(dp[n] != 0) return dp[n];
        return dp[n] = fun(n-1, dp) + fun(n-2, dp);
    }
}