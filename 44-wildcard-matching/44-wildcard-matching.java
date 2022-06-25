class Solution {
    public Boolean memo(int i,int j,String s,String p,Boolean [][] dp){
        if(i==s.length()&&j==p.length())return true;
        if(i==s.length()&&j!=p.length()){
            for(int k=j;k<p.length();k++){
                if(p.charAt(k)!='*')return false;
                
            }
            return true;
        }
        if(i!=s.length()&&j==p.length())return false;
        if(dp[i][j]!=null)return dp[i][j];
        char ch1=s.charAt(i);
        char ch2=p.charAt(j);
        if(ch1==ch2||ch2=='?'){
            
            return dp[i][j]=memo(i+1,j+1,s,p,dp);
        }
        
            if(ch2=='*'){
                Boolean no=memo(i,j+1,s,p,dp);
                if(no==true)return true;
                return dp[i][j]=memo(i+1,j,s,p,dp);
                
                
                
            
            // ;
        }
        return dp[i][j]=false;
        
    }
    
    
    
    public boolean isMatch(String s, String p) {
    Boolean [][] dp=new Boolean[s.length()+1][p.length()+1];
        
    
     return  memo(0,0,s,p,dp);  
        
        
        
        
        
    }
}