import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner sc=new Scanner(System.in); 
      int n=sc.nextInt();
      int m=sc.nextInt();
      int [][] arr=new int[n][m];
      for(int i=0;i<n;i++){
          for(int j=0;j<m;j++){
              arr[i][j]=sc.nextInt();
              
          }
      }
      int [][] dp = new int [n][m];
      for(int i=0;i<n;i++){
          Arrays.fill(dp[i],-1);
      }
      
 System.out.println( maxGold(arr,dp));
      
    }
    public static int maxGold(int [][] arr,int [][] dp ){
        
        for(int j=arr[0].length-1;j>=0;j--){  
     for(int i=arr.length-1;i>=0;i--){
      
             if(j==arr[0].length-1){
                 dp[i][j]=arr[i][j];
             }
                else {
                    int up=(i-1<0)?0:dp[i-1][j+1];
                    int right=dp[i][j+1];
                    int down=(i+1>arr.length-1)?0:dp[i+1][j+1];
                    
                    
                 dp[i][j]=arr[i][j]+Math.max(up,Math.max(right,down));
                }
             }
         }
     
     
      int ans=0;
      for(int i=0;i<arr.length;i++){
          ans=Math.max(ans,dp[i][0]);
      }
     return ans;
      
    }
        
        
        
    
    
    

}
