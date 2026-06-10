class Solution {
    public int longestCommonSubsequence(String text1, String text2) {
        // sub-array , sub-sequences (they have order)
        // set is the collecton of unique elements.
        //sub-set (do not have order)

        // tree-set : sorted order + remove duplicate order.


// in sub-sequence inbetween letter will get drop and order will get maintain always

        /*
        abcde : 2*2*2*2*2.
        */


        int dp[][]=new int[text1.length()][text2.length()];
        // filling the dp, can be filled by -1 or -2
        for(int r[]:dp)Arrays.fill(r,-2);

        return fun(text1,text2,0,0,dp);
    }
    int fun(String s1,String s2,int i,int j,int dp[][]){
        if(i==s1.length()|| j==s2.length()) return 0;

        if(dp[i][j]!=-2) return dp[i][j];

        int ans=-1;

        if(s1.charAt(i)==s2.charAt(j)){
            ans= 1+fun(s1,s2,i+1,j+1,dp);
        }
        else{
            int a=fun(s1,s2,i+1,j,dp);
            int b=fun(s1,s2,i,j+1,dp);

            ans=Math.max(a,b);
        }
        dp[i][j]=ans;
        return ans;
    }
}