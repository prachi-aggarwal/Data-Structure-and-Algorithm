class Solution {
    public int climbStairs(int n) {
  int [] dp=new int[n+1];
        dp[n]=1;
        for(int i=n-1;i>=0;i--){
            if(i+2<dp.length){
                dp[i]+=dp[i+2];
            }
                        if(i+1<dp.length){
                dp[i]+=dp[i+1];
            }
        }
        
        
        
        return dp[0];
        
    }
}