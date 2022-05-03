class Solution {
    public int uniquePathsIII(int[][] grid) {
        int countzero=0;
        int sx=0;
        int sy=0;
        // int count=0;
      
        boolean [] vis = new boolean[grid.length*grid[0].length];
        for(int i=0;i<grid.length;i++){
           for(int j=0;j<grid[0].length;j++){
               if(grid[i][j]==0)countzero++;
               if(grid[i][j]==1){
                   sx=i;
                   sy=j;
               }   
         }
        }
        
        return dfs(grid,sx,sy,countzero);
        
    }
    public int dfs(int[][] grid,int sx,int sy,int zero){
        if(sx<0||sy<0||sx>=grid.length||sy>=grid[0].length||grid[sx][sy]==-1){
            return 0;
        }
        if(grid[sx][sy]==2){
         if(zero==-1){
            return 1;
        }
        else if(zero>0){
            return 0;
        }
        }
        
        
        
        grid[sx][sy]=-1;
        zero--;
        int totalpaths= dfs(grid,sx+1,sy,zero)+dfs(grid,sx-1,sy,zero)+dfs(grid,sx,sy+1,zero)+dfs(grid,sx,sy-1,zero);
          
        grid[sx][sy]=0;
        zero++;
        return totalpaths;
    }
}