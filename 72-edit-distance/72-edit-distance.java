class Solution {
    public int memo(int i,int j,String s,String p,int [][] dp){
        if(i==s.length()&&j==p.length())return 0;
        if(i!=s.length()&&j==p.length())return s.length()-i;
         if(i==s.length()&&j!=p.length())return p.length()-j;
        if(dp[i][j]!=-1)return dp[i][j];
        if(s.charAt(i)==p.charAt(j)){
            return dp[i][j]=memo(i+1,j+1,s,p,dp);
        }
        else{
          return   dp[i][j]=1+Math.min(memo(i,j+1,s,p,dp),Math.min(memo(i+1,j+1,s,p,dp),memo(i+1,j,s,p,dp)));
        }
        
    }
    public int minDistance(String s, String p) {
          int [][] dp=new int[s.length()+1][p.length()+1];
        for(int i=0;i<dp.length;i++)
        Arrays.fill(dp[i],-1);
        
    
     return  memo(0,0,s,p,dp);  
        
        
        
        
        
        
    }
}