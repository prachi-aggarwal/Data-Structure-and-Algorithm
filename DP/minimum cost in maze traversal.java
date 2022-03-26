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



import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
      Scanner sc=new Scanner(System.in); 
      int n=sc.nextInt();
      int m=sc.nextInt();
      int [][] maze=new int[n][m];
      for(int i=0;i<n;i++){
          for(int j=0;j<m;j++){
              maze[i][j]=sc.nextInt();
              
          }
      }
      int cost=Integer.MAX_VALUE;
      
      minCostMaze(maze,0,0,n-1,m-1,cost);
      
      
      
    }
    public static int minCostMaze(int [][] maze,int sr,int sc,int dr,int dc, int cost){
        if(sr==dr&&sc==dc)return maze[sr][sc];
        if(sr>=maze.length||sc>=maze[0].length){
            return Integer.MAX_VALUE;
        }
        
        int x=minCostMaze(maze,sr+1,sc,dr,dc,cost);
        int y=minCostMaze(maze,sr,sc+1,dr,dc,cost);
        cost= maze[sr][sc]+Math.min(x,y);
        
        
        return cost;
        
    }

}
public class Main {

    public static void main(String[] args) throws Exception {
      Scanner sc=new Scanner(System.in); 
      int n=sc.nextInt();
      int m=sc.nextInt();
      int [][] maze=new int[n][m];
      for(int i=0;i<n;i++){
          for(int j=0;j<m;j++){
              maze[i][j]=sc.nextInt();
              
          }
      }
    //   int cost=Integer.MAX_VALUE;
      int [][] dp=new int[n][m];
      for(int i=0;i<n;i++){
          Arrays.fill(maze[i],-1);
      }
      minCostMaze(maze,0,0,n-1,m-1,dp);
      
      
      
    }
    public static int minCostMaze(int [][] maze,int sr,int sc,int dr,int dc,int[][] dp){
        if(sr==dr&&sc==dc)return maze[sr][sc];
        if(sr>=maze.length||sc>=maze[0].length){
            return Integer.MAX_VALUE;
        }
        if(dp[sr][sc]!=-1)
        return dp[sr][sc];
        
        int x=minCostMaze(maze,sr+1,sc,dr,dc,dp);
        int y=minCostMaze(maze,sr,sc+1,dr,dc,dp);
        int cost= maze[sr][sc] + Math.min(x,y);
        
        dp[sr][sc]=cost;
        return cost;
        
    }

}


public class Main {

    public static void main(String[] args) throws Exception {
      Scanner sc=new Scanner(System.in); 
      int n=sc.nextInt();
      int m=sc.nextInt();
      int [][] maze=new int[n][m];
      for(int i=0;i<n;i++){
          for(int j=0;j<m;j++){
              maze[i][j]=sc.nextInt();
              
          }
      }
    //   int cost=Integer.MAX_VALUE;
      int [][] dp=new int[n][m];
      
      System.out.println(tabulation(maze,dp));
      
      
      
    }
    public static int tabulation(int [][] maze,int [][] dp){
        int n=maze.length;
        int m=maze[0].length;
       for(int i=maze.length-1;i>=0;i--){
           for(int j=maze[0].length-1;j>=0;j--){
               
               if(i+1<n&&j+1<m)
                   dp[i][j]=maze[i][j]+Math.min(dp[i+1][j],dp[i][j+1]); 
                   else if(i==n-1&&j==m-1){
                       dp[i][j]=maze[i][j];
                   }
                   else if(j+1==m){
                       dp[i][j]=maze[i][j]+dp[i+1][j];
                   }
                   else if(i+1==n){
                       dp[i][j]=maze[i][j]+dp[i][j+1];
                   }
           }
       }
       
       
       return dp[0][0];
     
    }

}








































