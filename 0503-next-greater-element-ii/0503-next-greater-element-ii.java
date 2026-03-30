// class Solution {
//     public int[] nextGreaterElements(int[] nums) {
//         int n = nums.length;
//         int ans[]=new int[nums.length];
//         Arrays.fill(ans,-1);
//         for(int i=0;i<nums.length;i++){
//             for(int j=0;j<nums.length;j++){
//                 int idx=(i+j)%n;
//                 if(nums[idx]>nums[i]){
//                     ans[i]=nums[idx];
//                     break;
//                 }
//             }
//         }
//         return ans;
//     }
// }





class Solution {
    public int[] nextGreaterElements(int[] nums) {
        int n = nums.length;
        int ans[]=new int[nums.length];
        Arrays.fill(ans,-1);
        Stack<Integer> st= new Stack<>();
        for(int i=0;i<nums.length*2;i++){
            int idx=i%n;
            while(!st.isEmpty()&& nums[idx]>nums[st.peek()]){
                int j=st.pop();
                ans[j]=nums[idx];
            }
            st.push(idx);
        }
        return ans;
    }

}