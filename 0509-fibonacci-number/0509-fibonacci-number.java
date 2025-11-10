class Solution {
    public int fib(int N) {
        if(N<=1)
        return N;
        if(N==2)
            return 1;
        return fib(N-1) + fib(N-2);
    }
}