public class Solution {
    /**
     * @param costs: n x 3 cost matrix
     * @return: An integer, the minimum cost to paint all houses
     */
    public int minCost(int[][] costs) {
        if(costs.length==0)return 0;
         int [][] dp= new int[costs.length][costs[0].length];
        for(int i=0;i<dp[0].length;i++){
            dp[0][i]=costs[0][i];
        }
        
        for(int house=1;house<dp.length;house++){
            int min=Integer.MAX_VALUE;
        int secondmin=Integer.MAX_VALUE;
            for(int color=0;color<dp[0].length;color++){
            if(dp[house-1][color]<=min){
                secondmin=min;
                min=dp[house-1][color];
                
            }
            else if(dp[house-1][color]<=secondmin){
                secondmin=dp[house-1][color];
            }
        }
           for(int c=0;c<dp[0].length;c++){
              if(dp[house-1][c]==min){
                  dp[house][c]=costs[house][c]+secondmin;
              }
              else{
                    dp[house][c]=costs[house][c]+min;
              }
           }

          




        }


int minans=Integer.MAX_VALUE;
for(int i=0;i<dp[0].length;i++){
    minans=Math.min(minans,dp[dp.length-1][i]);
}


return minans;


    }
}
