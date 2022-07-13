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
// class Solution {
//     public int dfs(TreeNode root,int target){
//         if(root==null)return 0;
//         int count=0;
//         target-=root.val;
//         if(target==0)count++;
//         return count +dfs(root.left,target)+dfs(root.right,target);
//     }
//     public int pathSum(TreeNode root, int targetSum) {
//         if(root==null)return 0;
//         return dfs(root,targetSum)+pathSum(root.left,targetSum)+pathSum(root.right,targetSum);
//     }
// }

class Solution {
    HashMap<Integer,Integer> hm = new HashMap<>();
    public int dfs(TreeNode root,int target,int prefsum){
        if(root==null)return 0;
        int count=0;
        prefsum+=root.val;
        count=hm.getOrDefault(prefsum-target,0);
        hm.put(prefsum,hm.getOrDefault(prefsum,0)+1);
        count+=dfs(root.left,target,prefsum);
        count+=dfs(root.right,target,prefsum);
    hm.put(prefsum,hm.getOrDefault(prefsum,0)-1);    
        return count;
        
    }
    public int pathSum(TreeNode root, int targetSum) {
        if(root==null)return 0;
        hm.put(0,1);
        return dfs(root,targetSum,0);
    }
}