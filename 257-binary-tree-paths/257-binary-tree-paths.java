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
    public void dfs(TreeNode root,String path,List<String> res){
        if(root==null)return;
        if(root.left==null&&root.right==null){
        res.add(path+root.val); 
            return;
        }
        dfs(root.left,path+root.val+"->",res);
        dfs(root.right,path+root.val+"->",res);
    }
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> res=new ArrayList<>();
        
        dfs(root,"",res);
        
        
        return res;
        
    }
}