class Solution {
    static int helper(int left,int right,int [] arr,int [][] dp){
        if(left>right)return 0;
        if(dp[left][right]!=-1)
        return dp[left][right];
        
        
        int max=Integer.MIN_VALUE;
        
        for(int k=left;k<=right;k++){
            int l=helper(left,k-1,arr,dp);
            int r=helper(k+1,right,arr,dp);
            int cost=((left==0)?1:arr[left-1])*arr[k]*((right==arr.length-1)?1:arr[right+1]);
            max=Math.max(cost+l+r,max);
        }
        return dp[left][right]=max;
    }
    public int maxCoins(int[] nums) {
       int N=nums.length;
     int [][] dp=new int [N+1][N+1];
        for(int i=0;i<dp.length;i++){
        Arrays.fill(dp[i],-1);
        }
        return helper(0,N-1,nums,dp);
        
        
    }
}