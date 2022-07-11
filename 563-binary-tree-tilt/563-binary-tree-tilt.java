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
    public int global=0;
    public int dfs(TreeNode root){
        if(root==null)return 0;
        
        
        
        int left=dfs(root.left);
        int right=dfs(root.right);
        global+=Math.abs(left-right);
        int sum= left+right+root.val;
        return sum;
        
    }
    public int findTilt(TreeNode root) {
      if(root==null)return 0;
        dfs(root);
        return Math.abs(global);
    }
}