class Solution {
    public int longestValidParentheses(String s) {
        Stack<Integer> stk=new Stack<>();
        int maxlen=0;
        int j;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='('){
                stk.push(i);
                
            }
            else{
                if(stk.size()>0&&s.charAt(stk.peek())=='('){
                    stk.pop();
                    
                }
                else{
                    stk.push(i);
                }
            }
            
            if(stk.size()==0){
               j=-1;
            }
            else{
                j=stk.peek();
            }
             maxlen=Math.max(maxlen,i-j);
        }
        return maxlen;
    }
}