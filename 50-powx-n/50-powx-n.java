class Solution {
    public double power(double x,int n){
       if(n==0)return 1.00;
       
     double temp=power(x,n/2);
        if(n%2==0){
            return temp*temp;
        }
        else{
            return temp*temp*x;
        }
     
    }
    
    
    public double myPow(double x, int n) {
       
       if(n<0){
           double temp= power(x,-n);
          return 1.00/temp;
       }
        else{
            return power(x,n);
        }
        
        
        
        
        
    }
}