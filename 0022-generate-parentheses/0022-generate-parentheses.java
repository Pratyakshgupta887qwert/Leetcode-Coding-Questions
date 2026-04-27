// subsequnces : order matter karta h.
class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> l=new ArrayList<>();

        fun(n, 0, 0, "", l);
        return l;
    }
    void fun(int n, int o, int c, String s, List<String> l) {
        // base case
        if (s.length() == 2 * n) {
            l.add(s);
            return;
        }

        // add opening bracket
        if (o < n) {
            fun(n, o + 1, c, s + "(", l);
        }

        // add closing bracket (only if valid)
        if (c < o) {
            fun(n, o, c + 1, s + ")", l);
        }
    }
}