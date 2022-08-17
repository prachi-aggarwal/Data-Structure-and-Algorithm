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
    public  TreeNode findmax(TreeNode root){
        while(root.left!=null)root=root.left;
        return root;
    }
    public TreeNode deleteNode(TreeNode root, int val) {
           if(root==null)
        {
           return null;
        }
        if(val==root.val){
            if(root.left==null)return root.right;
            if(root.right==null)return root.left;
            
            TreeNode max=findmax(root.right);
           
            max.left=root.left;
          
            
        return root.right;
            
            
        }
       else if(val>root.val){
            root.right=deleteNode(root.right,val);
        }
        else if(val<root.val){
            root.left=deleteNode(root.left,val);
        }
        
        return root;
    }
}