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
    int xparent=-1;int xlevel=0;
    int yparent=-1;int ylevel=0;
    public void dfs(TreeNode root,int x,int y,int level){
        if(root==null)return;
        if(root.val==x)xlevel=level;
        if(root.val==y)ylevel=level;
        if(root.left!=null){
            if(root.left.val==x){
                xparent=root.val;
            }
            if(root.left.val==y){
                yparent=root.val;
            }
        }
        if(root.right!=null){
            if(root.right.val==x){
                xparent=root.val;
            }
            if(root.right.val==y){
                yparent=root.val;
            }
        }
        dfs(root.left,x,y,level+1);
        dfs(root.right,x,y,level+1);
    }
    public boolean isCousins(TreeNode root, int x, int y) {
        dfs(root,x,y,0);
       if(xparent==yparent)return false;
        if(xlevel!=ylevel)return false;
        else
            return true;
    }
}