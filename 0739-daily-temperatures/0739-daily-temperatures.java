/* in this we have find the next greater temp. : hint */

// in this TLE is coming

// class Solution {
//     public int[] dailyTemperatures(int[] temperatures) {
//         int ans[]=new int[temperatures.length];
//         for(int i=0;i<temperatures.length;i++){
//             for(int j=i+1;j<temperatures.length;j++){
//                 if(temperatures[i]<temperatures[j]){
//                     ans[i]=j-i;
//                     break;
//                 }
//             }
//         }
//         return ans;
//     }
// }




// optimized

// class Solution {
//     public int[] dailyTemperatures(int[] temperatures) {
//         int ans[]=new int[temperatures.length];
//         Stack<Integer> st= new Stack<>();
//         for(int i=temperatures.length-1;i>=0;i--){
//             while(!st.isEmpty()&&temperatures[st.peek()]<=temperatures[i]){
             
//                 st.pop();
//             }
//             if(st.isEmpty()){
//                 ans[i]=0;
//             }
//             else{
//                 ans[i]=st.peek()-i;
//             }
//             st.push(i);
//         }
//         return ans;
//     }
// }




// optimized-2

class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int ans[]=new int[temperatures.length];
        Stack<Integer> st= new Stack<>();
        for(int i=0;i<temperatures.length;i++){
            while(!st.isEmpty()&&temperatures[st.peek()]<temperatures[i]){
             
              int in=st.pop();
              ans[in]=i-in;  
            }
            st.push(i);
        }
        return ans;
    }
}