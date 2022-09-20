class Solution {
    public int maxProfit(int k, int[] prices) {
        
        int [][] dp=new int [k+1][prices.length];
        for(int i=1;i<=k;i++){
            for(int p=0;p<prices.length;p++){
                dp[i][p]=(p-1>=0)?dp[i][p-1]:0;
                for(int j=p-1;j>=0;j--){
                    dp[i][p]=Math.max(dp[i][p],prices[p]-prices[j]+dp[i-1][j]);
                }
            }
        }
        return dp[k][prices.length-1];
        
    }
}