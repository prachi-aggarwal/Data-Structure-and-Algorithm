class Solution {
    public int combinationSum4(int[] coins, int amount) {
       int[] dp=new int [amount+1];
        dp[0]=1;
        
           
               for(int j=1;j<dp.length;j++){
                    for(int i=0;i<coins.length;i++){
                   if(j>=coins[i])
                   dp[j]+=dp[j-coins[i]];
            }
        }
       
              
       return dp[amount];
           
    }
}