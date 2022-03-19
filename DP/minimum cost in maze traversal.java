class Solution {
    public int minPathSum(int[][] grid) {
        int [][] res=new int[grid.length][grid[0].length];
        
        // res[grid.length-1][grid[0].length-1]=grid[grid.length-1][grid[0].length-1];
        
        for(int i=grid.length-1;i>=0;i--){
            
            for(int j=grid[0].length-1; j>=0;j--){
                
                if(i+1<grid.length&&j+1<grid[0].length)
                    res[i][j]=grid[i][j]+Math.min(res[i+1][j],res[i][j+1]);
                else if(i==grid.length-1&&j==grid[0].length-1){
                    res[i][j]=grid[i][j];
                }
                
                else if(j+1==grid[0].length)
                     res[i][j]=grid[i][j]+res[i+1][j];
                
            else if(i+1==grid.length)
                res[i][j]=grid[i][j]+res[i][j+1];
            
                
            }
        
        }
         
 
        
        return res[0][0];
        
    }
}
