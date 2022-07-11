class Solution {
    public void dfs(int src,int dest,int [][] graph,boolean [] vis, List<List<Integer>> res,ArrayList<Integer> path){
        if(vis[src]==true)return;
       
        vis[src]=true;
        path.add(src);
         if(src==dest){
            res.add(new ArrayList<>(path));
             
             
        }
        for(int nbr:graph[src]){
            dfs(nbr,dest,graph,vis,res,path);
        }
        path.remove(path.size()-1);
        vis[src]=false;
        
    }
    public List<List<Integer>> allPathsSourceTarget(int[][] graph) {
        List<List<Integer>> res=new ArrayList<>();
        boolean [] vis =new boolean [graph.length];
        ArrayList<Integer> path =new ArrayList<>();
        dfs(0,graph.length-1,graph,vis,res,path);
       return res;
        
    }
}