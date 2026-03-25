//brute force : tle

// import java.util.Stack;

// class Solution {
//     public int longestValidParentheses(String s) {
//         int ans = 0; 

//         for(int i = 0; i < s.length(); i++){
//             for(int j = i; j < s.length(); j++){ 
//                 String sub = s.substring(i, j + 1);
//                 if(isValid(sub)){
//                     ans = Math.max(ans, sub.length());
//                 }
//             }
//         }
//         return ans;
//     }

//     public boolean isValid(String s) {
//         Stack<Character> stack = new Stack<>();

//         for(char ch : s.toCharArray()){
//             if(ch == '('){
//                 stack.push(')');
//             }
//             else if(stack.isEmpty() || stack.pop() != ch){
//                 return false;
//             }
//         }
//         return stack.isEmpty();
//     }
// }

// import java.util.Stack;

// class Solution {
//     public int longestValidParentheses(String s) {
//         int ans = 0; 

//         for(int i = 0; i < s.length(); i++){
//             for(int j = i; j < s.length(); j++){ 
//                 String sub = s.substring(i, j + 1);
//                 if(isValid(sub)){
//                     ans = Math.max(ans, sub.length());
//                 }
//             }
//         }
//         return ans;
//     }




//solve 1

// class Solution {
//     public int longestValidParentheses(String s) {
//         Stack<Integer> stack = new Stack<>();
//         int max = 0;
//         stack.push(-1);
//         for (int i = 0; i < s.length(); i++) {
//             char ch = s.charAt(i);
//             if (ch == '(') {
//                 stack.push(i);
//             } else {
//                 stack.pop();
//                 if (stack.isEmpty()) {
//                     stack.push(i);
//                 }
//                 max = Math.max(max, i - stack.peek());
//             }
//         }
//         return max;
//     }
// }



class Solution {
    public int longestValidParentheses(String s) {
        Stack<Integer> st = new Stack<>();
        int ans=0;
        st.push(-1);
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch=='(') st.push(i);
            else{
                st.pop();
                if(st.isEmpty()){
                    st.push(i);
                }
                else{
                    int len=i-st.peek();
                    ans=Math.max(ans,len);
                }
            }
        }
        return ans;
    }
}