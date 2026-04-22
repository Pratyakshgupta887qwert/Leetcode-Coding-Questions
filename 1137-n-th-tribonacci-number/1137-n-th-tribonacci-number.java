// class Solution {
//     public int tribonacci(int n) {
//         if(n==0) return 0;
//         if(n==1) return 1;
//         if(n==2) return 1;
//         return tribonacci(n-1)+tribonacci(n-2)+tribonacci(n-3);
//     }
// }


// by DP
class Solution {
    //global variable
    int dp[] = new int[38];

    public int tribonacci(int n) {
        return tri(n);
    }

    public int tri(int n){
        if(n==0) return 0;
        if(n==1) return 1;
        if(n==2) return 1;

        if(dp[n] != 0) return dp[n];

        dp[n] = tri(n-1) + tri(n-2) + tri(n-3);

        return dp[n];
    }
}