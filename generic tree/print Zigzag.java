 public static void levelOrderLinewiseZZ(Node node){
   Stack<Node> stk1=new Stack<>();
  int count =0;
   stk1.push(node);
   while(stk1.size()>0){
        Stack<Node> stk2=new Stack<>();
        while(stk1.size()>0){
       Node peek=stk1.pop();
       System.out.print(peek.data+" ");
       if(count%2==0){
           for(int i=0;i<peek.children.size();i++){
               stk2.push(peek.children.get(i));
           }
       }
       else{
           for(int i=peek.children.size()-1;i>=0;i--){
               stk2.push(peek.children.get(i));
           }
           
       }
        }
        System.out.println();
        stk1=stk2;
        
    count++;
           
       }
   }
  
