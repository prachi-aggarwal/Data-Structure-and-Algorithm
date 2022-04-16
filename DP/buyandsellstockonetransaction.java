class Solution {
    public int maxProfit(int[] prices) {
      
    int maxprofit=0;
        int buyingday=prices[0];
        for(int i=1;i<prices.length;i++){
            int profit=prices[i]-buyingday;
            maxprofit=Math.max(profit,maxprofit);
            if(prices[i]<buyingday){
                buyingday=prices[i];
            }
        }
        return maxprofit;
    }
}
              
