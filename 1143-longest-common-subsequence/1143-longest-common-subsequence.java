class Solution {
    public int longestCommonSubsequence(String text1, String text2) {
    
       int [] next=new int[text2.length()+1];
        for(int i=text1.length()-1;i>=0;i--){
            int [] curr=new int[text2.length()+1];
            for(int j=text2.length()-1;j>=0;j--){
                if(text1.charAt(i)==text2.charAt(j)){
               curr[j]=1+next[j+1];
            }
            else{
               curr[j]=Math.max(curr[j+1],next[j]);
            }
            }
            next=curr;
        }
        
        
        
      return next[0];
        
        
        
        
        
    }
}