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
    int count=0;
    public int dfs(TreeNode root,int val){
        if(root==null)return 0;
        int left=dfs(root.left,root.val);
          int right=dfs(root.right,root.val);
        int len=0;
        if(root.val==val){
            len=1+Math.max(left,right);
        }
        count=Math.max(count,1+left+right);
        return len;
      
        
        
    }
    public int longestUnivaluePath(TreeNode root) {
        if(root==null)return 0;
        count=0;
      dfs(root,-1);
        return count-1;
    }
}