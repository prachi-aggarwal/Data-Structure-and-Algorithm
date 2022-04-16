public class Solution {
    /**
     * @param n: non-negative integer, n posts
     * @param k: non-negative integer, k colors
     * @return: an integer, the total number of ways
     */
    public int numWays(int n, int k) {
        if(n==1)return k;
        // int[][] dp=new int [2][n];
        // dp[0][1]= k;
        // dp[1][1]=k*(k-1);
int previi=k;
int previj=k*(k-1);

        for(int i=2;i<n;i++){
            // dp[0][i]=dp[1][i-1/
            // dp[2][i]=dp[0][i]+dp[1][i];
            int currii=previj;
            int currij=(previj+previi)*(k-1);
            previi=currii;
            previj=currij;
        }
        // return (dp[0][n-1]+dp[1][n-1]);
        return previj+previi;
    }
}
