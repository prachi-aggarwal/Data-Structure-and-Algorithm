class Solution {
    public String longestPalindrome(String s) {
     
        
        String res="";
        for(int i=0;i<s.length();i++){
            int len=1;int left=i-1;int right=i+1;
            
            while(left>=0&&right<s.length()){
                if(s.charAt(left)==s.charAt(right)){
len=len+2;                left--;
                right++;
                }
                else break;
            }
            if(len>res.length()){
                res=s.substring(left+1,left+1+len);
            }
            
            
        }
          for(int i=0;i<s.length();i++){
           
            // int curr=0;
              if(i+1==s.length()||s.charAt(i)!=s.charAt(i+1)){
                  continue;
              }
               int len=2;int left=i-1;int right=i+2;
            while(right<s.length()&&left>=0){
                if(s.charAt(left)==s.charAt(right)){
               len=len+2;
                left--;
                right++;
                }else{
                    break;
                }
            }
            if(len>res.length()){
                res=s.substring(left+1,left+1+len);
            }
            
            
        }
        return res;
        
        
        
    }
}