//brute force
// class Solution {
//     public int bulbSwitch(int n) {
//         boolean bulb[] = new boolean[n+1];
//         for(int i = 1; i <= n; i++){
//             for(int j = 1; j * i <= n; j++){
//                 bulb[j * i] = !bulb[j * i];
//             }
//         }
//         int count = 0;
//         for(int i = 1; i <= n; i++) 
//             if(bulb[i]) count++;
//         return count;
//     }
// }




class Solution {
    public int bulbSwitch(int n) {
        return (int)Math.sqrt(n);
    }
}