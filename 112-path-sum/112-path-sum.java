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
    
    public boolean dfs(TreeNode root,int target){
        if(root==null)return false;
        if(root.left==null&&root.right==null){
            return root.val==target;
        }
        
        if(dfs(root.left,target-root.val)){
            return true;
        }
        
         if(dfs(root.right,target-root.val)){
            return true;
        }
        
        return false;
    }
    
    
    public boolean hasPathSum(TreeNode root, int targetSum) {
        if(root==null)return false;
       return dfs(root,targetSum);
    }
}