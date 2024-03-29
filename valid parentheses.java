class Solution {
    public boolean isValid(String s) {
       Stack<Character> stk=new Stack<>();
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(c==')'){
                if(stk.size()==0||stk.peek()!='('){
                    return false;
                }
                stk.pop();
                
            }
            else if(c==']'){
              if(stk.size()==0||stk.peek()!='['){
                  return false;
              }
                stk.pop();   
            }
            else if(c=='}'){
                 if(stk.size()==0||stk.peek()!='{'){
                     return false;
                 }
                stk.pop();
            }
            else{
                stk.push(c);
            }
        }
    
        if(stk.size()==0)return true;
        else
            return false;
    }
}
