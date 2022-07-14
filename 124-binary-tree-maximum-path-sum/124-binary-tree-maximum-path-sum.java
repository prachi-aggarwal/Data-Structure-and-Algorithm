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
    public int maxsum=Integer.MIN_VALUE;
    public int dfs(TreeNode root){
        if(root==null)return 0;
        int left=dfs(root.left);
        int right=dfs(root.right);
        int sum=root.val+Math.max(left,0)+Math.max(right,0);
        maxsum=Math.max(sum,maxsum);
        return root.val+Math.max(0,Math.max(left,right));
    }
    public int maxPathSum(TreeNode root) {
     if(root==null)return 0;
        dfs(root);
        return maxsum;
    }
}