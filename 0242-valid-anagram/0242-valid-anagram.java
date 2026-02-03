class Solution {
    public boolean isAnagram(String s, String t) {
        // same words and same number of times. length of new words same
        if(s.length()!=t.length()) return false;
        char[] a=s.toCharArray();
        char[] b=t.toCharArray();

        Arrays.sort(a);
        Arrays.sort(b);

        return Arrays.equals(a,b);
    }
}