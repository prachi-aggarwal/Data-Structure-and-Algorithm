public class Solution {
    public int solve(int[] profit, int[] weight, int cap) {
    int n=weight.length;
    int [][] dp=new int[n+1][cap+1];
    for(int i=1;i<=n;i++){
        for(int j=1;j<=cap;j++){
            int no=dp[i-1][j];
            
            int yes=(j-weight[i-1]<0)?0:profit[i-1]+dp[i-1][j-weight[i-1]];
            dp[i][j]= Math.max(no,yes);

        }
    }
    
    return dp[n][cap];
    
    
    
    
    
    
    
    
    }
}
