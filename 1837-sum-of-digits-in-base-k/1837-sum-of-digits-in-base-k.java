class Solution {
    public int sumBase(int n, int k) {
        int res=0;
        int i=0;
        
     while(n!=0){
         int rem=n%k;
         res=res+rem;
         n=n/k;
     }   
        return res;
    }
}