class Solution {
    HashSet<String> dict;
    public boolean helper(int i,String s,Boolean [] dp){
        if(i==s.length())
            return true;
        if(dp[i]!=null)return dp[i];
            
            for(int j=i;j<s.length();j++){
            String word=s.substring(i,j+1);
            if(dict.contains(word)==true&&helper(j+1,s,dp)==true){
                return dp[i]=true;
            }
            
        }
        return dp[i]=false;
    }
    public boolean wordBreak(String s, List<String> wordDict) {
      Boolean []  dp=new Boolean [s.length()];
    dict=new HashSet<>();
        for(String st:wordDict){
            dict.add(st);
        }
        return helper(0,s,dp);
        
        
    }
}