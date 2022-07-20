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
int pre=0;
    HashMap<Integer,Integer> hm=new HashMap<>();
    public  TreeNode helper(int [] preorder,int[] inorder,int st,int en){
        if(st>en)return null;
        TreeNode curr=new TreeNode(preorder[pre]);
       
        int j=hm.get(preorder[pre]);
         pre++;
        curr.left=helper(preorder,inorder,st,j-1);
          curr.right=helper(preorder,inorder,j+1,en);
        return curr;
    }
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        
        for(int i=0;i<inorder.length;i++){
            hm.put(inorder[i],i);
        }
        
        return helper(preorder,inorder,0,inorder.length-1);
    }
}