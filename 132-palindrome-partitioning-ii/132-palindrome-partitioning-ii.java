class Solution {
        public boolean isPalindrome(String s){
        int i=0;int j=s.length()-1;
        while(i<=j){
            if(s.charAt(i)!=s.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        
        return true;
    }
    
        public int helper(int i,String s,int [] dp){
     if(i==s.length()){
         return 0;
     }  
            if(dp[i]!=-1){
                return dp[i];
            }
        if(isPalindrome(s.substring(i))){
            return 0;
        }
             int mincut=Integer.MAX_VALUE;
        for(int j=i;j<s.length();j++){
            String str=s.substring(i,j+1);
           
            if(isPalindrome(str)){
                
              int cut=  helper(j+1,s,dp);
                mincut=Math.min(mincut,cut+1);
                
            }
        }
            return dp[i]=mincut;
        
    }
    public int minCut(String s) {
        int [] dp=new int[s.length()];
        Arrays.fill(dp,-1);
     return    helper(0,s,dp);
    }
}