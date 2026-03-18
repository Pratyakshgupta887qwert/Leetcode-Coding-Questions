// in this we have to do the long but last mei convert it to mode % matlb remender in 10^7 

class Solution {
    public int maxSum(int[] nums1, int[] nums2) {
        int i = 0, j = 0;
        long sum1 = 0, sum2 = 0;
        long score = 0;

        while (i < nums1.length && j < nums2.length) {
            if (nums1[i] < nums2[j]) {
                sum1 += nums1[i++];
            } else if (nums2[j] < nums1[i]) {
                sum2 += nums2[j++];
            } else {
                score += Math.max(sum1, sum2) + nums1[i];
                i++;
                j++;
                sum1 = 0;
                sum2 = 0;
            }
        }

        while (i < nums1.length) sum1 += nums1[i++];
        while (j < nums2.length) sum2 += nums2[j++];

        score += Math.max(sum1, sum2);

        return (int)(score % ((int)1e9 + 7));
    }
}