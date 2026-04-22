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
class Solution {
    public int climbStairs(int n) {
        int dp[] = new int[n+1];
        return fun(0, n, dp);
    }

    int fun(int i, int n, int dp[]){
        if(i == n) return 1;
        if(i > n) return 0;
        if(dp[i] != 0) return dp[i];
        int ways1 = fun(i+1, n, dp);
        int ways2 = fun(i+2, n, dp);
        return dp[i] = ways1 + ways2;
    }
}