class Solution {
    public String convertToBase7(int num) {
        
        int res=0;
        int i=0;
        while(num!=0){
            
            int rem=num%7;
            num=num/7;
            res=res+rem*(int)Math.pow(10,i);
            i++;
        }
        return Integer.toString(res);
        
    }
}