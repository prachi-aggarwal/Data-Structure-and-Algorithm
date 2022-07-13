class Solution {
    
    public void dfs(ArrayList<Integer>[] adj,boolean [] vis,int src){
        if(vis[src]==true){
            // extra++;
            return;
        }
        vis[src]=true;
        for(int nbr:adj[src]){
          
            dfs(adj,vis,nbr);
        }
        // vis[src]=false;
        // return c;
    }
    public int makeConnected(int n, int[][] connections) {
        if(n-1>connections.length)return -1;
      
        ArrayList<Integer>[] adj=new ArrayList[n];
        for(int i=0;i<n;i++){
            adj[i]=new ArrayList<>();
            
        }
        for(int i=0;i<connections.length;i++){
            adj[connections[i][0]].add(connections[i][1]);
            adj[connections[i][1]].add(connections[i][0]);
        }
        int count=0;
        // int extra=0;
        boolean [] vis=new boolean [n];
        for(int i=0;i<n;i++){
            
            if(vis[i]==false){

              dfs(adj,vis,i);
              
                count++;
            }
        }
        // System.out.println(extra);
    // if(count-1>extra)return -1;
        return count-1;
        
    }
}