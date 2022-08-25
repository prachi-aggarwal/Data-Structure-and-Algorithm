class Solution {
    
    public int memo(int [][] dp,int last,int amount,int [] coins){
        if(amount<0)return 0;
        if(amount==0)return 1;
        if(dp[amount][last]!=-1)return dp[amount][last];
        int comb=0;
        for(int i=last;i<coins.length;i++ ){
          comb += memo(dp,i,amount-coins[i],coins);
        }
        return dp[amount][last]=comb;
    }
    
    public int change(int amount, int[] coins) {
        int [][] dp=new int [amount+1][coins.length+1];
        for(int i=0;i<dp.length;i++)
        Arrays.fill(dp[i],-1);
        
       return memo(dp,0,amount,coins);
        
       
        
    }
}