class Solution {
    public int numDecodings(String s) {
        int[] dp=new int [s.length()+1];
        dp[s.length()]=1;
        for(int i=s.length()-1;i>=0;i--){
           int ch1=s.charAt(i)-'0';
            if(ch1>0&&ch1<=9){
                dp[i]+=dp[i+1];
                
            }
            if(i+1<s.length()){
            int ch2=(s.charAt(i)-'0')*10+s.charAt(i+1)-'0';
            if(ch2>9&&ch2<=26){
                dp[i]+=dp[i+2];
            }
            }
        }
        
            return dp[0];
        
    }
}