class Solution
{
    public static boolean dfs(Node root,int target,ArrayList<Integer> arr){
        
        if(root==null)return false;
        
        if(target==root.data)return true;
        // arr.add(root);
        if(dfs(root.left,target,arr)){
             arr.add(root.data);
            return true;
        }
          if(dfs(root.right,target,arr)){
             arr.add(root.data);
            return true;
        }
        
        return false;
        
        
    }
    
    public static ArrayList<Integer> Ancestors(Node root, int target)
    {
        ArrayList<Integer> arr=new ArrayList<>();
        dfs(root,target,arr);
        return arr;
    }
}
