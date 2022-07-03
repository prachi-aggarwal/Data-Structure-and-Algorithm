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
    static class pair{
        int height=0;
        boolean isBalanced=true;
    }
    public pair helper(TreeNode root){
        if(root==null){
            return new pair();
            
        }
        pair left=helper(root.left);
        pair right=helper(root.right);
        
        
        
        pair curr= new pair();
        curr.height=Math.max(left.height,right.height)+1;
    curr.isBalanced=(left.isBalanced&&right.isBalanced&&(Math.abs(left.height-right.height)<=1));
        return curr;
        
        
    }
    public boolean isBalanced(TreeNode root) {
      return helper(root).isBalanced; 
        
        
        
        
        
    }
}