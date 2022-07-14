/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public boolean rootpath(TreeNode root,TreeNode target,ArrayList<TreeNode> arr){
     if(root==null)return false;
        if(root==target){
            arr.add(root);
            return true;
        }
        arr.add(root);
       if(rootpath(root.left,target,arr)==true)return true;
         if(rootpath(root.right,target,arr)==true)return true;
        arr.remove(arr.size()-1);
        return false;
    }
    public void klevel(TreeNode root,int k,TreeNode blocker,List<Integer> res ){
       if(k<0||root==null||blocker==root)return;
        if(k==0){
            res.add(root.val);
            return;
        }
        // res.add(root.val);
        klevel(root.left,k-1,blocker,res);
         klevel(root.right,k-1,blocker,res);
    }
    
    public List<Integer> distanceK(TreeNode root, TreeNode target, int k) {
        ArrayList<TreeNode> arr=new ArrayList<>();
        if(rootpath(root,target,arr)==false){
            return new ArrayList<>();      
        }
        
    
  
    arr.add(null);
    List<Integer> res=new ArrayList<>();
    for(int i=arr.size()-2;i>=0;i--){
        TreeNode curr=arr.get(i);
        TreeNode blocker =arr.get(i+1);
        klevel(curr,k,blocker,res);
        k--;
        
    }
    return res;
}
}