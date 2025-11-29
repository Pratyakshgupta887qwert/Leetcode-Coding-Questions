// 2 pointer

class Solution {
    public String mergeAlternately(String word1, String word2) {
        StringBuilder sb = new StringBuilder();

        int i = 0, j = 0;
        while (i < word1.length() && j < word2.length()) {
            sb.append(word1.charAt(i));
            sb.append(word2.charAt(j));
            i++;
            j++;
        }
        if (i < word1.length()) {
            sb.append(word1.substring(i));
        }
        if (j < word2.length()) {
            sb.append(word2.substring(j));
        }

        return sb.toString();
    }
}

// single pointer

// class Solution {
//     public String mergeAlternately(String word1, String word2) {
//         StringBuilder result = new StringBuilder();
//         int i = 0;

//         // Loop until we reach the end of both strings
//         while (i < word1.length() || i < word2.length()) {

//             // If word1 still has characters, add them
//             if (i < word1.length()) {
//                 result.append(word1.charAt(i));
//             }

//             // If word2 still has characters, add them
//             if (i < word2.length()) {
//                 result.append(word2.charAt(i));
//             }

//             i++;
//         }

//         return result.toString();
//     }
// }
