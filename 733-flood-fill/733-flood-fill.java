class Solution {
    public void dfs(int sr,int sc,int newcolor,int [][] image,int old){
        if(sc<0||sc>=image[0].length||sr<0||sr>=image.length)return;
       if(image[sr][sc]!=old)return;
        
            image[sr][sc]=newcolor;
        
        dfs(sr+1,sc,newcolor,image,old);
        dfs(sr,sc+1,newcolor,image,old);

        dfs(sr-1,sc,newcolor,image,old);
        dfs(sr,sc-1,newcolor,image,old);
    }
    public int[][] floodFill(int[][] image, int sr, int sc, int newColor) {
        if(newColor==image[sr][sc])return image;
        
     
        dfs(sr,sc,newColor,image,image[sr][sc]);
        
        return image;
        
        
        
    }
}