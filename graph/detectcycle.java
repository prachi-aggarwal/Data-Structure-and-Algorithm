class Solution {
    public boolean dfs(int src,int parent,boolean [] vis,ArrayList<ArrayList<Integer>> adj){
        
        if(vis[src]==true)return true;
        vis[src]=true;
        for(Integer nbr:adj.get(src)){
            if(nbr!=parent&& dfs(nbr,src,vis,adj)==true){
                return true;
            }
        }
        
        return false;
    }
    // Function to detect cycle in an undirected graph.
    public boolean isCycle(int V, ArrayList<ArrayList<Integer>> adj) {
        boolean [] vis=new boolean [V];
        
  
  
  for(int i=0;i<V;i++){
          if(vis[i]==false)
          if(dfs(i,-1,vis,adj)==true)return true;
  }
  return false;
    }

}
