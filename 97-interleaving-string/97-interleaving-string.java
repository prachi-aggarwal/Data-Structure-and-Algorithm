class Solution {
    public Boolean memo(int i,int j,int k,String s1,String s2,String s3,Boolean [][] dp){
        if(s3.length()==k)return true;
        char ch1=(i<s1.length())?s1.charAt(i):'A';
        char ch2=(j<s2.length())?s2.charAt(j):'B';
        if(dp[i][j]!=null)return dp[i][j];
        
        if(ch1==s3.charAt(k)){
        if(memo(i+1,j,k+1,s1,s2,s3,dp)  )return dp[i][j]=true;
        }
         if(ch2==s3.charAt(k)){
           if(memo(i,j+1,k+1,s1,s2,s3,dp)  )return dp[i][j]=true;
         }
        
          return dp[i][j]= false;
        // return false;
    }
    public boolean isInterleave(String s1, String s2, String s3) {
        if(s1.length()+s2.length()>s3.length())return false;
        Boolean [][] dp=new Boolean [s1.length()+1][s2.length()+1];
        // for(int i=0;i<dp.length;i++){
        //     Arrays.fill(dp[i],-1);
        // }
        return memo(0,0,0,s1,s2,s3,dp);
        
    }
}