// { Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG
{
    public static void main(String args[])throws IOException
    {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(in.readLine());
        while(t-- > 0){
            int N = Integer.parseInt(in.readLine());
            String input_line[] = in.readLine().trim().split("\\s+");
            int arr[]= new int[N];
            for(int i = 0; i < N; i++)
                arr[i] = Integer.parseInt(input_line[i]);
            
            Solution ob = new Solution();
            System.out.println(ob.matrixMultiplication(N, arr));
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution{
    // static int helper(int left,int right,int [] arr,int [][] dp){
    //     if(left==right)return 0;
    //     if(dp[left][right]!=-1)
    //     return dp[left][right];
        
        
    //     int max=Integer.MAX_VALUE;
        
    //     for(int k=left;k<right;k++){
    //         int l=helper(left,k,arr,dp);
    //         int r=helper(k+1,right,arr,dp);
    //         int cost=l+r+arr[left]*arr[k+1]*arr[right+1];
    //         max=Math.min(cost,max);
    //     }
    //     return dp[left][right]=max;
    // }
    static int matrixMultiplication(int N, int nums[])
    {
        
        
        
        int [][] dp=new int [N][N];
        for(int gap=1;gap<N-1;gap++){
            for(int l=0,r=gap;r<N-1;r++,l++){
                int mincost=Integer.MAX_VALUE;
                for(int k=l;k<r;k++){
                    int left=dp[l][k];
                    int right=dp[k+1][r];
                    int cost=left+right+(nums[l]*nums[k+1]*nums[r+1]);
                    mincost=Math.min(mincost,cost);
                }
                dp[l][r]=mincost;
            }
        }
        
        
        return dp[0][N-2];
    }
}