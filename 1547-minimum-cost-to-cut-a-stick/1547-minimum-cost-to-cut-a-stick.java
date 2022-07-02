class Solution {
    public int helper(int ss,int se,int [] arr,int l,int r,int [][] dp){
        if(l>r)return 0;
        if(dp[l][r]!=-1)return dp[l][r];
        int mincost=Integer.MAX_VALUE;
        for(int k=l;k<=r;k++){
            int left=helper(ss,arr[k],arr,l,k-1,dp);
            int right=helper(arr[k],se,arr,k+1,r,dp);
            int cost=left+right+se-ss;
            mincost=Math.min(cost,mincost);
            
        }
        return dp[l][r]=mincost;
    }
    public int minCost(int n, int[] cuts) {
     Arrays.sort(cuts);
        int [][] dp=new int [cuts.length+1][cuts.length+1];
        for(int i=0;i<dp.length;i++)
            Arrays.fill(dp[i],-1);
        
        return helper(0,n,cuts,0,cuts.length-1,dp);
    }
}