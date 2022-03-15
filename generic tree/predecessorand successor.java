static Node predecessor;
  static Node successor;
  static int state=-1;
  public static void predecessorAndSuccessor(Node node, int data) {
   if(state==-1){
       if(node.data==data){
           state++;
       }
       else{
           predecessor=node;
       }
   }
   else if(state==0){
       successor=node;
       state++;
       return;
   }
   for(Node child:node.children){
       predecessorAndSuccessor(child,data);
   }
