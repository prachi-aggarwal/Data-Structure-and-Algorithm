class Solution {
    public int[] plusOne(int[] digits) {
       int i=digits.length-1; 
   while(i>=0){
    if(digits[i]!=9){
        digits[i]++;
        break;
    }   
       else{
           digits[i]=0;
       }
       i--;
   }
        
        if(digits[0]==0){
            int [] res=new int[digits.length+1];
            res[0]=1;
            return res;
        }
        return digits;
        
        
        
    }
}