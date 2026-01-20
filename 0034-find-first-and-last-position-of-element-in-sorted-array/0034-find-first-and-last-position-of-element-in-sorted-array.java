// class Solution {
//     public int[] searchRange(int[] nums, int target) {
//         int first = -1, last = -1;

//         // find first occurrence
//         for (int i = 0; i < nums.length; i++) {
//             if (nums[i] == target) {
//                 first = i;
//                 break;
//             }
//         }

//         // find last occurrence
//         for (int i = nums.length - 1; i >= 0; i--) {
//             if (nums[i] == target) {
//                 last = i;
//                 break;
//             }
//         }

//         return new int[]{first, last};
//     }
// }


// in single loop

class Solution {
    public int[] searchRange(int[] nums, int target) {
        int first = -1, last = -1;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target) {
                if (first == -1) first = i; // first time hit
                last = i;                  // keep updating last
            }
        }
        return new int[]{first, last};
    }
}
