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
    public void dfs(TreeNode root,ArrayList<Integer> levelsum,int level){
        if(root==null)return;
        if(levelsum.size()>level){
            levelsum.set(level,levelsum.get(level)+root.val);
        }
        else{
            levelsum.add(root.val);
        }
        dfs(root.left,levelsum,level+1);
          dfs(root.right,levelsum,level+1);
        
    }
    public int maxLevelSum(TreeNode root) {

        ArrayList<Integer> levelsum=new ArrayList<>();
        levelsum.add(0);
        int level=1;
        // int l=1;
        dfs(root,levelsum,level);
        int max=1;
        for(int i=1;i<levelsum.size();i++){
           if(levelsum.get(max)<levelsum.get(i)){
               max=i;
              
           }
        }
        return max;
    }
}