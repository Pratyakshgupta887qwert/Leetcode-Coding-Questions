// class Solution {
//     public int lengthOfLastWord(String s) {
//         s=s.trim();
//         String words[]=s.split(" ");
//         return words[words.length-1].length();
//     }
// }


class Solution {

    public int lengthOfLastWord(String s) {
        s = s.trim();
        int l = 0;

        for (int i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) == ' ') {
                break;
            }
            l++;
        }

        return l;
    }

}
