
class Solution {
    public boolean dfs(int src,int [] vis,ArrayList<ArrayList<Integer>> adj){
        if(vis[src]==0)return true;
        if(vis[src]==1)return false;
        vis[src]=0;
        for(Integer nbr:adj.get(src)){
            if(dfs(nbr,vis,adj)==true)return true;
        }
        vis[src]=1;
        return false;
    }
    // Function to detect cycle in a directed graph.
    public boolean isCyclic(int V, ArrayList<ArrayList<Integer>> adj) {
        int [] vis =new int [V];
        Arrays.fill(vis,-1);
        for(int i=0;i<V;i++){
            if(dfs(i,vis,adj))return true;
        }
        return false;
    }
}
