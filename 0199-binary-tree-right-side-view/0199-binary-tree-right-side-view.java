/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> l=new ArrayList<>();
        fun(root, 0, l);
        return l;
    }
    void fun(TreeNode root, int l , List<Integer> list){
        if(root ==null) return;

        if(l==list.size()){
            list.add(root.val);
        }
        fun(root.right,l+1,list);
        fun(root.left,l+1,list);
    }
}