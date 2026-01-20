class Solution {
    public int search(int[] nums, int target) {
        int start=0,end=nums.length-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            // this means : start+end/2-start/2
            // start/2 +end/2 
            // (end+start)/2
            if(nums[mid]==target)return mid;
            else if(target>nums[mid]){
                start=mid+1;
            }
            else end = mid-1;
        }
        return -1;
    }
}