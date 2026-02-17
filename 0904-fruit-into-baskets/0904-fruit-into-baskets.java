// class Solution {
//     public int totalFruit(int[] fruits) {
//         int max=0;
//         for(int i=0;i<fruits.length;i++){
//             Set<Integer> s=new HashSet<>();
//             int count=0;
//             for(int j=i;j<fruits.length;j++){
//                 s.add(fruits[j]);
//                 if(s.size()>2)break;
//                 count++;
//             }
//             max=Math.max(max,count);
//         }
//         return max;
//     }
// }


// class Solution {
//     public int totalFruit(int[] fruits) {
//         int max=0;
//         for(int i=0;i<fruits.length;i++){
//             int fr[]=new int[100001];
//             int type=0;

//             int count=0;
//             for(int j=i;j<fruits.length;j++){
//                 int f=fruits[j];
//                 if (fr[f]==0)type++;
//                 fr[f]++;
//                 if(type>2) break;
//                 count++;
//             }
//             max=Math.max(max,count);
//         }
//         return max;
//     }
// }

class Solution {
    public int totalFruit(int[] fruits) {
        int fr[]=new int[100001];
        int type=0;

        int max=0;
        int s=0;
        for(int e=0;e<fruits.length;e++){
            int f=fruits[e];
            if(fr[f]==0) type++;
            fr[f]++;

            while(type>2){
                int sf=fruits[s];
                fr[sf]--;
                if(fr[sf]==0)type--;
                s++;
            }
            int pick=e-s+1;
            max=Math.max(max,pick);
        }
        return max;
    }
}