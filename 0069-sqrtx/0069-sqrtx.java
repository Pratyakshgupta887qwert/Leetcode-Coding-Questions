class Solution {
    public int mySqrt(int x) {
        // return (int) Math.sqrt(x);
// we will get the error : lossy conversion , so we will use type conversion in this (int).
        // or
        return (int) Math.pow(x,0.5);
    }
}