// class Solution {
//     public int canCompleteCircuit(int[] gas, int[] cost) {
//         int pos =-1 , curr =0 ,total = 0;

//         for (int i=0;i<gas.length ; i++){
//             int diff = gas[i]-cost[i];

//             curr += diff;
//             total += diff;

//             if(curr <0){
//                 curr =0;
//                 pos = i;
//             }
//         }
//         if(total >=0){
//             return pos + 1;
//         }
//         return -1;
//     }
// }



// class Solution {
//     public int canCompleteCircuit(int[] gas, int[] cost) {
//         //circular queue
//         int n=gas.length;
//         for(int i=0;i<gas.length;i++){
//             int fuel=0;
//             boolean possible=true;
//             for(int j=i;j<i+n;j++){
//                 int in=j%n;
//                 fuel+=gas[in]-cost[in];
//                 if(fuel<0){
//                     possible=false;
//                     break;
//                 }
//             }
//             if(possible)return i;
//         }
//         return -1;
//     }
// }



class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int n=gas.length;
        int totalGas=0,totalCost=0;
        for(int i:gas){
            totalGas+=i;
        }
        for(int i:cost){
            totalCost+=i;
        }
        if(totalGas<totalCost) return -1;
        int si=0;
        int fuel=0;
        for(int i=0;i<n;i++){
            fuel+=gas[i]-cost[i];
            if(fuel<0){
                si=i+1;
                fuel=0;
            }
        }
        return si;
    }
}