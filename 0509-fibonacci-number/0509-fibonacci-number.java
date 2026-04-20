// class Solution {
//     public int fib(int N) {
//         if(N<=1)
//         return N;
//         if(N==2)
//             return 1;
//         return fib(N-1) + fib(N-2);
//     }
// }

// class Solution{
//     public int fib(int N){
//         int a=0,b=1;
//         for(int i=0;i<N;i++){
//             int c = a+b;
//             a=b;
//             b=c;
//         }
//         return a;

//     }
// }



class Solution {
    public int fib(int N) {
        if (N == 0) return 0;
        if (N == 1) return 1;
        return fib(N - 1) + fib(N - 2);
    }
}
