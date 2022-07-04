class Solution {
    public int numsquare(int n){
        int sum=0;
        while(n!=0){
        sum+=(n%10)*(n%10);
            n=n/10;
        }
         System.out.println(sum);
        return sum;
        
    }
    public boolean isHappy(int n) {
        if(n==7||n==1)return true;
        int sum=n;
        while(sum>9){
             sum=numsquare(sum);
            if(sum==7||sum==1)return true;
         System.out.println(sum);
            
        }
        return false;
    }
}