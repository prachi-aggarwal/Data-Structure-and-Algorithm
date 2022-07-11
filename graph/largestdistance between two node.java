public class Solution {
   public  int globaldia=0;
    public int dfs(ArrayList<Integer>[] arr,int root){
        // if(root==null)return 0;
        int maxheight=0;
        int secondmax=0;
       for(int nbr:arr[root]){
          int height= dfs(arr,nbr);
          if(height>maxheight){
              secondmax=maxheight;
              maxheight=height;
          }
          else if(height>=secondmax){
              secondmax=height;
          }
          
       }
       globaldia=Math.max(globaldia,maxheight+secondmax+1);
       return maxheight+1;
        
    }
    public int solve(int[] A) {
    
    
    ArrayList<Integer>[] arr=new ArrayList[A.length];
    for(int i=0;i<A.length;i++){
        arr[i]=new ArrayList<>();
    }
    int root=0;
    for(int i=0;i<A.length;i++){
        if(A[i]==-1){
            root=i;
        }
        else{
            arr[A[i]].add(i);
        }
    }
    dfs(arr,root);
    
    
    
    return globaldia-1;
    
    
    
    
    
    
    }  
}
