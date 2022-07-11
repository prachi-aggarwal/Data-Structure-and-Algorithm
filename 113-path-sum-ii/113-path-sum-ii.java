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
    public void dfs(TreeNode root,ArrayList<Integer>arr,List<List<Integer>> res,int target){
        if(root==null)return ;
        arr.add(root.val);
        if(root.left==null&&root.right==null){
            if(target==root.val){
                res.add(new ArrayList<>(arr));
            }
             arr.remove(arr.size()-1);
            return;
        }
        dfs(root.left,arr,res,target-root.val);
        
         dfs(root.right,arr,res,target-root.val);
        
        arr.remove(arr.size()-1);
        
        
        }
    
    
    
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        List<List<Integer>> res=new ArrayList<>();
        ArrayList<Integer> arr=new ArrayList<>();
    dfs(root,arr,res,targetSum);
        return res;
    }
}