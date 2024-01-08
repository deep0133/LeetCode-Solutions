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
    
    int NLR(TreeNode root , int low, int high,int ans){
        if(root == null) return 0;
        
        int val = root.val;
        
        if(val >= low && val <= high) ans += val;
        
        if(root.left != null) ans = NLR(root.left,low,high,ans);
        if(root.right != null) ans = NLR(root.right,low,high,ans);
        
        return ans;
    }
    
    public int rangeSumBST(TreeNode root, int low, int high) {
        return NLR(root,low,high,0);
    }
}