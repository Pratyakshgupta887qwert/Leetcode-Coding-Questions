// class Solution {
//     public int[] maxSlidingWindow(int[] nums, int k) {
//         //how to find the length of ans array; length of example - k (+1).
//         int[] ans=new int[nums.length-k+1];
        
//         for(int i=0;i<=nums.length-k;i++){
//             int max=Integer.MIN_VALUE;
//             for(int j=i;j<i+k;j++){
//                 max=Math.max(max,nums[j]);
//             }
//             ans[i]=max;
//         }
//         return ans;
//     }
// }



//doubly ended queue.
class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int n=nums.length;
        int [] ans=new int[n-k+1];

        Deque<Integer> q=new ArrayDeque<>();
        for(int i=0;i<n;i++){
            while(!q.isEmpty() && q.peekFirst() <= i-k){
                q.pollFirst();

            }
            while(!q.isEmpty() && nums[q.peekLast()]<nums[i]){
                q.pollLast();
            }
            q.addLast(i);
            if(i>=k-1){
                ans[i-k+1]=nums[q.peekFirst()];
            }
        }
        return ans;
    }
}