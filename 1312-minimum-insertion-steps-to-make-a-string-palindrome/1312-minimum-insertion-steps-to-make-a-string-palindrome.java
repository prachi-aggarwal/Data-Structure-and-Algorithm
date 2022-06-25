class Solution {
      public  int LCS( String s1,String s2){
       int [][] dp=new int[s1.length()+1][s2.length()+1];
        for(int i=s1.length()-1;i>=0;i--){
            for(int j=s2.length()-1;j>=0;j--){
                if(s1.charAt(i)==s2.charAt(j)){
                    dp[i][j]=1+dp[i+1][j+1];
                }
                else{
                    dp[i][j]=Math.max(dp[i+1][j],dp[i][j+1]);
                }
            }
        }
        return dp[0][0];
    }
    public int minInsertions(String s) {
          StringBuilder sb=new StringBuilder(s);
        sb.reverse();
        
        String s2=new String(sb);
        return s.length()-LCS(s,s2);
    }
}