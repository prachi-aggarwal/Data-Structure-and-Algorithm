
class Solution{
    static int knapSack(int N, int W, int val[], int wt[])
    {
        int [] dp=new int[W+1];
        //i-->current target weight  and j-->weigth or option to explore
        for(int i=1;i<dp.length;i++){
        for(int j=0;j<wt.length;j++){
           if(i-wt[j]>=0){
               int rem=dp[i-wt[j]];
               int totalprofit=val[j]+rem;
               dp[i]=Math.max(dp[i],totalprofit);
           } 
        }
        }
        return dp[W];
    }
}
