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
     int sum=0;
    public void helper(TreeNode root,int value){
        if(root==null)return;
        if(root.left==null&&root.right==null){
            
          
            sum=sum+value*10+root.val;
              // System.out.println(value+"---------"+sum);
            
            return;
        }
        helper(root.left,value*10+root.val);
        helper(root.right,value*10+root.val);
    }
    public int sumNumbers(TreeNode root) {
        helper(root,0);
        return sum;
    }
}


// class Solution {
//     int sum=0;
//     public int sumNumbers(TreeNode root) 
//     {
//         if(root==null)
//             return 0;
//         helper(root,0);
//         return sum;
//     }
//     public void helper(TreeNode root,int val)
//     {
//         if(root==null)
//             return;
//         if(root.left==null && root.right==null)
//         {
//             sum=sum+val*10+root.val;
//             return;
//         }
//         helper(root.left,root.val+val*10);
//         helper(root.right,root.val+val*10);
//     }
// }