class Solution {
    public int reverse(int x) {
       
        int count =0;
        int num=x;
        while(x>0){
            count++;
            x=x/10;
        }
        boolean minus=false;
         if(num<0){
               num= -1*(num);
                minus=true;
            }
  
        long res=0;
        while(num>=1){
           
            int mod=num%10;
             num=num/10;
             res=res*10+mod;
           
            if(res>Integer.MAX_VALUE||res<Integer.MIN_VALUE)return 0;
            count--;
            
        }
             if(minus==true)res=-1*res;
        
      
   
        return (int)res;
        
    }
}