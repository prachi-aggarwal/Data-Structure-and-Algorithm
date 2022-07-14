class Solution {
    // public int visited=0;
    public boolean dfs(int src,ArrayList<Integer>[] adj,int [] vis,int numCourses){
        if(vis[src]==0)return true;
        if(vis[src]==1)return false;
        vis[src]=0;
        // visited++;
        for(int nbr:adj[src]){
            if(dfs(nbr,adj,vis,numCourses)==true)return true;
        }
        vis[src]=1;
        
        return false;
    }
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        ArrayList<Integer>[] adj=new ArrayList[numCourses];
        for(int i=0;i<numCourses;i++){
            adj[i]=new ArrayList<>();
            
        }
        for(int [] arr:prerequisites){
            adj[arr[1]].add(arr[0]);
        }
        int [] vis=new int[numCourses];
        Arrays.fill(vis,-1);
        for(int i=0;i<numCourses;i++){
            if(vis[i]==-1){
            if(dfs(i,adj,vis,numCourses)==true)return false;
            }
        }
        return true;
    }
}