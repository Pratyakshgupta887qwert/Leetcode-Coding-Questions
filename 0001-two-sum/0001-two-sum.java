class Solution {
    public int[] twoSum(int[] nums, int target) {
        int ans[]=new int[2];
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]+nums[j]==target){
                    ans[0]=i;
                    ans[1]=j;
                    //break : it is not imp to write for optimization we write this 
                    break;
                }
            }
        }
        return ans;
    }
}


// class Solution {
//     public int[] twoSum(int[] nums, int target) {
//         int ans[]=new int[2];
//         for(int i=0;i<nums.length;i++){
//             for(int j=i+1;j<nums.length;j++){
//                 if(nums[i]+nums[j]==target){
//                     return new int[]{i,j}*************************** most impt direct array.
//                     //break : it is not imp to write for optimization we write this 
//                     break;
//                 }
//             }
//         }
//         return ans;
//     }
// }