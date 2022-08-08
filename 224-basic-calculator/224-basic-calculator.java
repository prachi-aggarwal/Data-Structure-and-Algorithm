
class Solution {
    public int perform(int a,int b,char c){
        int out=0;
        if(c=='+'){
        out=a+b;   
        }
         if(c=='*'){
        out=a*b;   
        }
         if(c=='-'){
        out=a-b;   
        }
         if(c=='/'){
        out=a/b;   
        }
        return out;
    }
    public int precedence(char ch){
        if(ch=='+'||ch=='-'){
            return 0;
        }
        else if(ch=='*'||ch=='/'){
            return 1;
        }
        return -1;
    }
    public String refine(String s){
        StringBuilder res =new StringBuilder("");
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch=='+'){
             if(res.length()==0||res.charAt(res.length()-1)=='('||res.charAt(res.length()-1)=='-'||res.charAt(res.length()-1)=='+'){
                    continue;
                }
                else{
                    res.append(ch);
                }
                
            }
            else if(ch=='-'){
               if(res.length()==0||res.charAt(res.length()-1)=='('){
                   res.append("0-");
               }
                else if(res.charAt(res.length()-1)=='-'){
                    res.setCharAt(res.length()-1,'+');
                }
                else if(res.charAt(res.length()-1)=='+'){
                     res.setCharAt(res.length()-1,'-');
                }
                else{
                    res.append(ch);
                }
                   
            }
            else if(ch==' ')continue;
                else
            res.append(ch);
        }
        return res.toString();
    }
    public int calculate(String s) {
        
        String exp=refine(s);
        // System.out.println(exp);
        Stack<Integer> operand=new Stack<>();
        Stack<Character> operator=new Stack<>();
        for(int i=0;i<exp.length();i++){
            char ch=exp.charAt(i);
            if(ch=='('){
                operator.push(ch);
            }
            else if(ch=='+'||ch=='-'||ch=='*'||ch=='/'){
                while(operator.size()>0&&operator.peek()!='('&&precedence(ch)<=precedence(operator.peek())){
                char op=operator.pop();
                int b=operand.pop();
                    int a=operand.pop();
                int val=perform(a,b,op);
                operand.push(val);
                }
                operator.push(ch);
            }
            else if(ch==')'){
                while(operator.peek()!='('){
                   char op=operator.pop();
                int b=operand.pop();
                    int a=operand.pop();
                int val=perform(a,b,op);
                operand.push(val);   
                }
                operator.pop();
            }
            else if(ch>='0'&&ch<='9'){
                int num=0;
                while(i<exp.length()&&exp.charAt(i)>='0'&&exp.charAt(i)<='9'){
                    num=num*10+exp.charAt(i)-'0';
                    i++;
                }
                operand.push(num);
                i--;
            }
            // operator.push(ch);
            
        }
        while(operator.size()>0){
           char ch=operator.pop();
                int b=operand.pop();
                    int a=operand.pop();
                int val=perform(a,b,ch);
                operand.push(val);   
                
                // operator.pop();  
        }
       
        return operand.peek();
    }
}