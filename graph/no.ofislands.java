class Solution {
    public static void  dfs(char[][] grid,int r,int c){
     if(r<0||c<0||r>=grid.length||c>=grid[0].length||grid[r][c]=='0')return;
        
        grid[r][c]='0';
        dfs(grid,r+1,c);
        dfs(grid,r-1,c);
        dfs(grid,r,c+1);
        dfs(grid,r,c-1);
        return;
        
    }
    public int numIslands(char[][] grid) {
      
        int islands=0;
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(grid[i][j]=='1'){
                    dfs(grid,i,j);
                    islands++;
                }
            }
        }
        return islands;
    }
}
