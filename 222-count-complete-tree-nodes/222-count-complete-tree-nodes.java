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
       public int leftmost(TreeNode root){
        int ans=0;
        while(root!=null){
            root=root.left;
            ans++;
        }
        return ans;
    }
      public int rightmost(TreeNode root){
        int ans=0;
        while(root!=null){
            root=root.right;
            ans++;
        }
        return ans;
    }
    public int countNodes(TreeNode root) {
     if(root==null)return 0;
        
        int left=leftmost(root);
        int right=rightmost(root);
        if(left==right){
            return ((1<<right)-1);
        }
        
        return 1+countNodes(root.left)+countNodes(root.right);
        
        
        
        
    }
}