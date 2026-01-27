// class Solution {
//     public int[] successfulPairs(int[] spells, int[] potions, long success) {
//         int ans[]=new int[spells.length];
//         int count=0;
//         for(int i=0;i<spells.length;i++){
//             for(int j=0;j<potions.length;j++){
//                 long res=(long)spells[i]*potions[j];
//                 if(res>=success){
//                     count++;
//                 }
//             }
//             ans[i]=count;
//             count=0;
//         }
//         return ans; 
//     }
// }



import java.util.*;

class Solution {
    public int[] successfulPairs(int[] spells, int[] potions, long success) {
        int n = spells.length;
        int m = potions.length;
        int[] ans = new int[n];

        // Sort potions
        Arrays.sort(potions);

        for (int i = 0; i < n; i++) {
            int left = 0, right = m - 1;
            int index = m; // default = no valid potion

            while (left <= right) {
                int mid = left + (right - left) / 2;
                long product = (long) spells[i] * potions[mid];

                if (product >= success) {
                    index = mid;
                    right = mid - 1;
                } else {
                    left = mid + 1;
                }
            }
            ans[i] = m - index;
        }

        return ans;
    }
}
