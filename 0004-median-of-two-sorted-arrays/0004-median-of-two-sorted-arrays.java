class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        List<Integer> l = new ArrayList<>();
        for(int i:nums1)l.add(i);
         for(int i:nums2)l.add(i);
         Collections.sort(l);
         int n=l.size();
         if(n%2==1){
            return(double) l.get(n/2);
         }
        else{
            int a=l.get(n/2);
            int b=l.get(n/2-1);
            return (a+b)/2.0;
        }
    }
}