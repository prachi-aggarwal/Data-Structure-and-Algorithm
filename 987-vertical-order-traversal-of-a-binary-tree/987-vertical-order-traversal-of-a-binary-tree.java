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
    TreeMap<Integer,TreeMap<Integer,ArrayList<Integer>>> vertical;
    public void dfs(TreeNode root,int col,int row){
        if(root==null)return;
        if(vertical.containsKey(col)==false){
            vertical.put(col,new TreeMap<>());
            
        }
        if(vertical.get(col).containsKey(row)==false){
            vertical.get(col).put(row,new ArrayList<>());
        }
        vertical.get(col).get(row).add(root.val);
        dfs(root.left,col-1,row+1);
        dfs(root.right,col+1,row+1);
        
    }
    public List<List<Integer>> verticalTraversal(TreeNode root) {
        vertical=new TreeMap<>();
       List<List<Integer>> res=new ArrayList<>();
        if(root==null)return res;
        dfs(root,0,0);
        for(Integer i:vertical.keySet()){
            List<Integer> oned=new ArrayList<>();
            TreeMap<Integer,ArrayList<Integer>> arr=vertical.get(i);
            for(Integer row:arr.keySet()){
                ArrayList<Integer> a=arr.get(row);
                 Collections.sort(a);
                for(Integer j:a){
                    oned.add(j);
                }
            }
           
            res.add(oned);
        }
        return res;
    }
}