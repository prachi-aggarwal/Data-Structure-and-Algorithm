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
     if(state==1){
       return;//jb complete milgya toh agge na chalane ko loop optimise krdia,wrna iske bina  b correct tha
     }
       predecessorAndSuccessor(child,data);
   }
