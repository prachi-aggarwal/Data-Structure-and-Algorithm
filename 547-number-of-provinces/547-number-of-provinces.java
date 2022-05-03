class Solution {
    public int findCircleNum(int[][] isConnected) {
      int [] vis=new int [isConnected.length];
        int n=isConnected.length;
        int count=0;
        for(int i=0;i<n;i++){
            if(vis[i]==0){
                dfs(isConnected,i,vis);
                count++;
            }
        }
        return count;
    }
    public static void dfs(int [][] isConnected,int i,int[] vis){
        for(int j=0;j<isConnected.length;j++){
            if(vis[j]==0&&isConnected[i][j]==1){
                vis[j]=1;
                dfs(isConnected,j,vis);
                
            }
        }
    }
}