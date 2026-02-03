// class Solution {
//     public boolean isPalindrome(String s) {
//         int left = 0, right = s.length() - 1;
//         while (left < right) {
//             while (left < right && !Character.isLetterOrDigit(s.charAt(left))) left++;
//             while (left < right && !Character.isLetterOrDigit(s.charAt(right))) right--;
//             if (Character.toLowerCase(s.charAt(left)) != Character.toLowerCase(s.charAt(right))) {
//                 return false;
//             }
//             left++;
//             right--;
//         }
//         return true;
//     }
// }









class Solution{
    public boolean isPalindrome(String s){
        s=s.toLowerCase();
        String ns="";
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch>='a' && ch<='z' || ch>='0' && ch<='9'){
                ns+=ch;
            }
        }
        return palindrom(ns);
    }
    boolean palindrom(String s){

// normal

        // StringBuilder s2=new StringBuilder(s);
        // return s2.reverse().toString().equals(s);


// 2 pointers
    int l = 0, r = s.length() - 1;

    while (l < r) {
        if (s.charAt(l) != s.charAt(r)) return false;
        l++;
        r--;
    }
    return true;
    }
}

