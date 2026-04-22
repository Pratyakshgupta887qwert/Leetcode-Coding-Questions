// class Solution {
//     public int tribonacci(int n) {
//         if(n==0) return 0;
//         if(n==1) return 1;
//         if(n==2) return 1;
//         return tribonacci(n-1)+tribonacci(n-2)+tribonacci(n-3);
//     }
// }


// by DP (globa v.)
// class Solution {
//     //global variable
//     int dp[] = new int[38];

//     public int tribonacci(int n) {
//         return tri(n);
//     }

//     public int tri(int n){
//         if(n==0) return 0;
//         if(n==1) return 1;
//         if(n==2) return 1;

//         if(dp[n] != 0) return dp[n];

//         dp[n] = tri(n-1) + tri(n-2) + tri(n-3);

//         return dp[n];
//     }
// }




// class Solution {
//     public int tribonacci(int n) {
//         int dp[] = new int[n + 1];
//         return tri(n, dp);
//     }

//     public int tri(int n, int dp[]){
//         if(n==0) return 0;
//         if(n==1) return 1;
//         if(n==2) return 1;

//         if(dp[n] != 0) return dp[n];

//         dp[n] = tri(n-1, dp) + tri(n-2, dp) + tri(n-3, dp);

//         return dp[n];
//     }
// }



// time complex. of both the dp is same'
//buttom up dp is faster than drop down dp.


//buttom up DP
class Solution {
    public int tribonacci(int n) {
        if(n==0) return 0;
        if(n==1 || n==2) return 1;

        int dp[]=new int[n+1];
        dp[0]=0;
        dp[1]=1;
        dp[2]=1;

        for(int i=3;i<=n;i++){
            dp[i]=dp[i-1]+dp[i-2]+dp[i-3];
        }
        return dp[n];
    }
}