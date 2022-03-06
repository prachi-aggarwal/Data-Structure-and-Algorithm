class Solution {
    public int minCostClimbingStairs(int[] cost) {
        int n=cost.length;
          int [] dp=new int[n+1];
        int m=n+1;
        dp[m-1]=0;
        dp[m-2]=cost[cost.length-1];
        for(int i=m-3;i>=0;i--){
            if(i+1<dp.length&&i+2<dp.length){
                dp[i]+=cost[i]+Math.min(dp[i+1],dp[i+2]);
            }
      
        
        }
        for(int i=0;i<dp.length;i++){
            System.out.println(dp[i]);
        }
        
        return Math.min(dp[0],dp[1]);
    }
}