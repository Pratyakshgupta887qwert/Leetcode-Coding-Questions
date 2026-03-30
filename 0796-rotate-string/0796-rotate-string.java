class Solution{
    public boolean rotateString(String s, String goal){
        if(s.length() != goal.length()) return false;
        return (s+s).contains(goal);
    }
}


// class Solution {
//     public boolean rotateString(String s, String goal) {
//         for(int i=1;i<s.length();i++){
//             String rot=s.substring(i)+s.substring(0,1);
//             if(rot.equals(goal)) return true;
//         }
//         return false;
//     }
// }