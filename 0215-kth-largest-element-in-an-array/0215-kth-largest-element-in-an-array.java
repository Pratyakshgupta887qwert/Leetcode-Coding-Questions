// class Solution {
//     public int findKthLargest(int[] nums, int k) {
//         Arrays.sort(nums);
//         return nums[nums.length-k];
//     }
// }




//by priority queue.

// class Solution{
//     public int findKthLargest(int[] nums,int k){
//         PriorityQueue<Integer> pq= new PriorityQueue<>();
//         for(int i=0;i<nums.length;i++){
//             pq.add(nums[i]);
//             if(i>=k)pq.poll();
//         }
//         return pq.peek();
//     }
// }


// this means i1,i2 = > i1-i2 means ascending order and if i2-i1 it means decending order.
// this is more optimize.
class Solution{
    public int findKthLargest(int[] nums,int k){
        PriorityQueue<Integer> pq= new PriorityQueue<>((i1,i2)->i1-i2);
        for(int i=0;i<nums.length;i++){
            pq.add(nums[i]);
            if(i>=k)pq.poll();
        }
        return pq.peek();
    }
}