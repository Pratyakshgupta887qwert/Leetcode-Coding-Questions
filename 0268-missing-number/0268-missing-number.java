// class Solution {
//     public int missingNumber(int[] nums) {
//         //with the help of sorting
//         Arrays.sort(nums);
//         for(int i=0;i<nums.length;i++){
//             if(nums[i]!=i)return i;
//         }
//         return nums.length;
//     }
// }



// class Solution {
//     public int missingNumber(int[] nums) {
//         //with the help of sorting
//         int n=nums.length;
//         int expected=n*(n+1)/2;
//         int actual=0;
//         for(int num :nums){
//             actual+=num;

//         }
//         return expected-actual;
//     }
// }



// this question can also be done by XOR.






class Solution {
    public int missingNumber(int[] nums) {
        //with the help of sorting
        int n=nums.length;
        boolean arr[]=new boolean[n+1];
        for(int i:nums)arr[i]=true;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==false)return i;

        }
        return -1;
    }
}