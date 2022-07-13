class Solution {
    public boolean dfs (int src,int [][]graph,int [] vis,int level){
        if(vis[src]!=-1){
            if(vis[src]!=level%2)
                return false;
            return true;
        }
        vis[src]=level%2;
       for(int nbr:graph[src]){
            if(dfs(nbr,graph,vis,level+1)==false)return false;
        }
        return true;
    }
    public boolean isBipartite(int[][] graph) {
        int [] vis=new int[graph.length];
        Arrays.fill(vis,-1);
        
        for(int i=0;i<graph.length;i++){
            if(vis[i]==-1){
               if( dfs(i,graph,vis,0)==false)return false;
            }
        }
        return true;
        
    }
}