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
    public int widthOfBinaryTree(TreeNode root) {
      if(root.left==null&&root.right==null)return 1;
        Deque<TreeNode> q=new ArrayDeque<>();
        q.add(root);
        int max=0;
        while(q.size()>0){
            int size=q.size();
            max=Math.max(max,q.getLast().val-q.getFirst().val +1);
            while(size>0){
           TreeNode front=q.removeFirst();
                // if(front==null)continue;
            if(front.left!=null){
                front.left.val=front.val*2;
                q.addLast(front.left);
            }
                
           if(front.right!=null){
                front.right.val=front.val*2+1;
                q.addLast(front.right);
            }
              
            size--;
            }
            
        }
        return max;   
    }
}