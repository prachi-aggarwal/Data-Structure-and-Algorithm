class Solution {
    
    public boolean isPalindrome(int x) {
     if(x<0||x!=0&&x%10==0)return false;
        int rev=0;
        int temp=x;
        while(x>0){
            int rem=x%10;
        rev=rev*10+rem; 
            x=x/10;
        }
        System.out.println(rev);
        if(rev==temp)return true;
        return false;
        
        
        
    }
}