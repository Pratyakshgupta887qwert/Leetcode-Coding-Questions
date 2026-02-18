// class Solution {
//     public int lengthOfLongestSubstring(String s) {
//         int max=0;
//         for(int i=0;i<s.length();i++){
//             Set<Character> st=new HashSet<>();
//             for(int j=i;j<s.length();j++){
//                 char ch=s.charAt(j);

//                 if(st.contains(ch))break;
//                 st.add(ch);

//             }
//             max=Math.max(max,st.size());
//         }
//         return max;
//     }
// }




// frequency array.(variable side sliding window).
class Solution{
    public int lengthOfLongestSubstring(String s){
        int max=0;
        for(int i=0;i<s.length();i++){
            int fr[]=new int[256];
            int count=0;
            for(int j=i;j<s.length();j++){
                char ch=s.charAt(j);
                fr[ch]++;
                if(fr[ch]>1)break;
                count++;
            }
            max=Math.max(max,count);
        }
        return max;
    }
}