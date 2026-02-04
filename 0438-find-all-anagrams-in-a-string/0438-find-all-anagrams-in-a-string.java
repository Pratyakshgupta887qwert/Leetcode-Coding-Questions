import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> ans = new ArrayList<>();
        int k = p.length();

        for (int i = 0; i <= s.length() - k; i++) {
            String sub = s.substring(i, i + k);
            if (isAnagram(sub, p)) ans.add(i);
        }
        return ans;
    }

    public boolean isAnagram(String s, String t) {
        // by frequncy array
        int f1[] = new int[26];
        for (char ch : s.toCharArray()) {
            f1[ch - 'a']++;
        }

        int f2[] = new int[26];
        for (char ch : t.toCharArray()) {
            f2[ch - 'a']++;
        }
        return Arrays.equals(f1, f2);
    }
}
