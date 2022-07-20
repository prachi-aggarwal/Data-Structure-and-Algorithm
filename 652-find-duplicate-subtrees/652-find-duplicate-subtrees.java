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
    List<TreeNode> res;
    HashMap<String,Integer> hm=new HashMap<>();
    public String dfs(TreeNode root){
        if(root==null)return "#";
        String hash=root.val+","+dfs(root.left)+","+dfs(root.right);
        if(hm.containsKey(hash)==true&&hm.get(hash)==1){
            res.add(root);
            
        }
        hm.put(hash,hm.getOrDefault(hash,0)+1);
        return hash;
    }
    public List<TreeNode> findDuplicateSubtrees(TreeNode root) {
        res=new ArrayList<>();
        
        dfs(root);
        return res;
    }
}