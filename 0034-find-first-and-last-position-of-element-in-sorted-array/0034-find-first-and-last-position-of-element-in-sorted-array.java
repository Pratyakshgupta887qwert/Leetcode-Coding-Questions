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


// class Solution {
//     public int[] searchRange(int[] nums, int target) {
//         int first = -1, last = -1;

//         for (int i = 0; i < nums.length; i++) {
//             if (nums[i] == target) {
//                 if (first == -1) first = i; // first time hit
//                 last = i;                  // keep updating last
//             }
//         }
//         return new int[]{first, last};
//     }
// }





// in binary search

class Solution {
    public int[] searchRange(int[] nums, int target) {
        int f = findFirst(nums, target);
        int l = findLast(nums, target);
        return new int[]{f, l};
    }

    private int findFirst(int[] nums, int target) {
        int start = 0, end = nums.length - 1;
        int ans = -1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (nums[mid] == target) {
                ans = mid;
                end = mid - 1;   // go left
            } else if (nums[mid] < target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return ans;
    }

    private int findLast(int[] nums, int target) {
        int start = 0, end = nums.length - 1;
        int ans = -1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (nums[mid] == target) {
                ans = mid;
                start = mid + 1; // go right
            } else if (nums[mid] < target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return ans;
    }
}
