class Solution {
    int [][] dr={{-1,0},{1,0},{0,-1},{0,1}};
    public void dfs(int r,int c,int [][] heights,boolean[][] vis){
        if(vis[r][c]==true)return;
        vis[r][c]=true;
        for(int i=0;i<4;i++){
            int nr=r+dr[i][0];
            int nc=c+dr[i][1];
            if(nr<0||nc<0||nr>=heights.length||nc>=heights[r].length){
                continue;
            }
            if(heights[r][c]<=heights[nr][nc])
         dfs(nr,nc,heights,vis);   
        }
    
    }
    public List<List<Integer>> pacificAtlantic(int[][] heights) {
      
        int m=heights.length;
        int n=heights[0].length;
        boolean [][] pacific =new boolean[m][n];
        for(int i=0;i<m;i++){
            dfs(i,0,heights,pacific);
        }
         for(int i=0;i<n;i++){
            dfs(0,i,heights,pacific);
        }
        boolean [][] atlantic =new boolean[m][n];
          for(int i=0;i<m;i++){
            dfs(i,n-1,heights,atlantic);
        }
         for(int i=0;i<n;i++){
            dfs(m-1,i,heights,atlantic);
        }
        List<List<Integer>> res=new ArrayList<>();
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(atlantic[i][j]==true&&pacific[i][j]==true){
                    ArrayList<Integer> arr=new ArrayList<>();
                    arr.add(i);arr.add(j);
                    res.add(arr);
                }
            }
        }
        return res;
    }
}