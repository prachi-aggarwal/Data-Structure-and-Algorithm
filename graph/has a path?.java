class Solution {
     boolean found=false;
    public boolean validPath(int n, int[][] edges, int source, int destination) {
        if(source==destination)return true;
      boolean [] visited=new boolean[n];
        
        HashMap<Integer,List<Integer>> graph=new HashMap();
        for(int i=0;i<n;i++){
            graph.put(i,new ArrayList<>());
        }
        for(int [] edge:edges){
            graph.get(edge[0]).add(edge[1]);
            graph.get(edge[1]).add(edge[0]);
        }
        dfs(graph,source,destination,visited);
        return found;
        
    }
    public void dfs(HashMap<Integer,List<Integer>> graph,int source,int destination,boolean [] visited){
        if(found==true||visited[source]==true){
            return;
        }
        visited[source]=true;
        for(int nei:graph.get(source)){
            if(nei==destination){
                found=true;
                break;
            }
            if(!visited[nei])
            dfs(graph,nei,destination,visited);
        }
        
        
        
        
    }
}


