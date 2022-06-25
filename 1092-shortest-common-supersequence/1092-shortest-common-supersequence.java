class Solution {
    String sc="";
    public void backtrack(int i,int j,String s1,String s2,int [][] dp,String ans){
        if(i==s1.length()&&j==s2.length()){
            sc=ans;
            return;
        }
        // String ans="";
        char c1=(i<s1.length())?s1.charAt(i):'A';
        char c2=(j<s2.length())?s2.charAt(j):'B';
        if(c1==c2){
            backtrack(i+1,j+1,s1,s2,dp,ans+c1);
        }
        else if(i+1<=s1.length()&&dp[i][j]==dp[i+1][j]){
            backtrack(i+1,j,s1,s2,dp,ans+c1);
        }
        else{
            backtrack(i,j+1,s1,s2,dp,ans+c2);
        }
        // return sc;
    }
    public String shortestCommonSupersequence(String s1, String s2) {
       // public  int LCS( String s1,String s2){
       int [][] dp=new int[s1.length()+1][s2.length()+1];
        String res="";
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
      backtrack(0,0,s1,s2,dp,"");
        return sc;
    }
}