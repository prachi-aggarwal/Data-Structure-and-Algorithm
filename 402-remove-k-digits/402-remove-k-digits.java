class Solution {
    public String removeKdigits(String num, int k) {
        if(k==0){
            return num;
        }
        if(k==num.length())return "0";
      
        
        
        Stack<Character> stk=new Stack<>();
        int index=0;
        while(index<num.length()){
            while(k>0&&stk.size()>=1&&stk.peek()>num.charAt(index)){
                stk.pop();
                k--;
            }
            stk.push(num.charAt(index));
            index++;
        }
        while(k-->0)stk.pop();
        
        
        String smallest="";
        while(stk.size()>0){
            smallest=stk.pop()+smallest;
            
        }
        while(smallest.length()>1&&smallest.charAt(0)=='0') smallest=smallest.substring(1);
        return smallest;
        
    }
}