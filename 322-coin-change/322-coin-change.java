class Solution {
    public int helper(int [] coins,int [] dp,int amount){
        if(amount==0)return 0;
        if(dp[amount]!=-1)return dp[amount];
    int minCoins=Integer.MAX_VALUE;
         for(int i=0;i<coins.length;i++){
             if(amount-coins[i]>=0)
        minCoins=Math.min(minCoins,helper(coins,dp,amount-coins[i]));
             }
        
        if(minCoins<Integer.MAX_VALUE)minCoins=minCoins+1;
        dp[amount]=minCoins;
        return dp[amount];
    }
    public int coinChange(int[] coins, int amount) {
        
        int [] dp=new int[amount+1];
        Arrays.fill(dp,-1);
        
       int ans= helper(coins,dp,amount);
        return (ans==Integer.MAX_VALUE)?-1:ans;
    }
}