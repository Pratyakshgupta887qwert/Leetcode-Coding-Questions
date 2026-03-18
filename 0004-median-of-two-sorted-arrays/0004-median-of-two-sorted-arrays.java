// class Solution {
//     public double findMedianSortedArrays(int[] nums1, int[] nums2) {
//         List<Integer> l = new ArrayList<>();
//         for(int i:nums1)l.add(i);
//          for(int i:nums2)l.add(i);
//          Collections.sort(l);
//          int n=l.size();
//          if(n%2==1){
//             return(double) l.get(n/2);
//          }
//         else{
//             int a=l.get(n/2);
//             int b=l.get(n/2-1);
//             return (a+b)/2.0;
//         }
//     }
// }




//merge sort
class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n1 = nums1.length;
        int n2 = nums2.length;
        int arr[] = new int[n1 + n2];

        int i = 0, j = 0, k = 0;

        // Merge both arrays
        while (i < n1 && j < n2) {
            if (nums1[i] <= nums2[j]) {
                arr[k++] = nums1[i++];
            } else {
                arr[k++] = nums2[j++];
            }
        }

        // Remaining elements
        while (i < n1) arr[k++] = nums1[i++];
        while (j < n2) arr[k++] = nums2[j++];

        int n = arr.length;

        // Find median
        if (n % 2 == 1) {
            return (double) arr[n / 2];
        } else {
            int a = arr[n / 2];
            int b = arr[n / 2 - 1];
            return (a + b) / 2.0;
        }
    }
}