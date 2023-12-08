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
    
    StringBuilder buildString(TreeNode root,StringBuilder s){
        if(root == null) return s;
        
        s.append(root.val);
        
        if(root.left != null || root.right != null) {
            s.append("(");
            buildString(root.left,s);
            s.append(")");
        } 
        
        if(root.right != null) {
            s.append('(');
            buildString(root.right,s);
            s.append(")");
        }
        
        return s;
        
        
    }
    
    public String tree2str(TreeNode root) {
        StringBuilder s = new StringBuilder();
        
        return buildString(root,s).toString();
    }
}