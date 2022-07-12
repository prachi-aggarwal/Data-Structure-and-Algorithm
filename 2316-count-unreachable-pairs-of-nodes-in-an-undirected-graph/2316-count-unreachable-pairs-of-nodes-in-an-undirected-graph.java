class Solution {
    public void dfs(int src,boolean [] vis,ArrayList<Integer>[] adj,ArrayList<Integer> component){
        if(vis[src]==true)return;
        vis[src]=true;
        component.add(src);
        for(Integer nbr:adj[src]){
            dfs(nbr,vis,adj,component);
        }
    }
    public long countPairs(int n, int[][] edges) {
      
        ArrayList<Integer>[] adj=new ArrayList[n];
        for(int i=0;i<n;i++)
            adj[i]=new ArrayList<>();
        for(int [] edge:edges){
            adj[edge[0]].add(edge[1]);
            adj[edge[1]].add(edge[0]);
        }
        boolean [] vis=new boolean[n];
        long pairs=0;
        
        for(int i=0;i<n;i++){
            if(vis[i]==false){
                ArrayList<Integer> component=new ArrayList<Integer>();
                dfs(i,vis,adj,component);
                // System.out.println(component.size());
                pairs+=(component.size()*(((n*1l)-component.size())));
            }
        }
        // 
      return pairs/2l;  
    }
}