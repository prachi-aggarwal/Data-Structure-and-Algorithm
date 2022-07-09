class Solution {
    public int remove(int [] arr){
        int count=0;
        int i=0;
        while(i<arr.length){
            if(arr[i]!=0){
                return i;
            }
            i++;
        }
        return -1;
    }
    public String multiply(String num1, String num2) {
        int [] res=new int [num1.length()+num2.length()];
        int pf=0;
       for(int i=num2.length()-1;i>=0;i--){
           int k=res.length-1-pf;
           int carry=0;
           
           for(int j=num1.length()-1;j>=0||carry!=0;j--){
              int ival=(i>=0)?num2.charAt(i)-'0':0;
                int jval=(j>=0)?num1.charAt(j)-'0':0;
               int product=ival*jval+carry+res[k];
               int ans=product%10;
               carry=product/10;
               res[k]=ans;
               k--;
               
           }
           pf++;
           // if(carry!=0)res[k]=carry;
       }
        String ans="";
        int count=remove(res);
        if(count ==-1)return "0";
        for(int i=count;i<res.length;i++){
            ans=ans+res[i];
        } 
        // if(ans="")return '0';
        return ans;
    }
}