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
     HashMap<Integer,Integer> hm=new HashMap<>();
    public TreeNode helper(int [] preorder,int [] postorder,int presid,int preeid,int postsid,int posteid ){
        if(presid>preeid)return null;
        TreeNode curr=new TreeNode(preorder[presid]);
          if(presid+1>=preorder.length)return curr;
        
        if(presid==preeid)return new TreeNode(preorder[presid]);
        int postidx=hm.get(preorder[presid+1]);
        int leftcount=postidx-postsid+1;
        curr.left=helper(preorder,postorder,presid+1,presid+leftcount,postsid,postidx);
        curr.right=helper(preorder,postorder,presid+leftcount+1,preeid,postidx+1,posteid-1);
      
        return curr;
        
        
        
        
        
    }
    public TreeNode constructFromPrePost(int[] preorder, int[] postorder) {
     for(int i=0;i<postorder.length;i++){
            hm.put(postorder[i],i);
        }
        return helper(preorder,postorder,0,preorder.length-1,0,postorder.length-1) ;  
    }
}