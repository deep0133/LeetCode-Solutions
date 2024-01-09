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
    
    void NLR(TreeNode root, ArrayList<Integer> arr){
        if(root == null) return;
        
        if (root.left == null && root.right == null) {
            // Add to the list only if it's a leaf node
            arr.add(root.val);
        }
        
        NLR(root.left, arr);
        NLR(root.right, arr);
        
    }
    
    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        ArrayList<Integer> arr_1 =  new ArrayList<>();
        ArrayList<Integer> arr_2 =  new ArrayList<>();
        
        NLR(root1,arr_1);
        NLR(root2,arr_2);
        
        if(arr_1.size() != arr_2.size()) return false;
        
        for(int i = 0;i<arr_1.size();i++){
            if(arr_1.get(i) != arr_2.get(i)) return false;
        }
        
        return true;
        
    }
}