// class Solution {
//     public int singleNumber(int[] nums) {
//         int result=0;
//         for(int i=0;i<32;i++){
//             int sum=0;
//             for(int num:nums){
//                 if(((num>>i)&1)==1){
//                     sum++;

//                 }
//             }
//             if(sum%3!=0){
//                 result|=(1<<i);
//             }
//         }
//         return result;
//     }
// }



// by hashmap
class Solution {
    public int singleNumber(int[] nums) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i:nums){
            map.put(i,map.getOrDefault(i,0)+1);
        }
        for(int k:map.keySet()){
            if(map.get(k)==1)return k;
        }
        return -1;
    }
}