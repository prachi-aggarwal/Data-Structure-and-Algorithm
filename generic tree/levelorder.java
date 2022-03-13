//linear

public static void levelOrder(Node node){
   Queue<Node> q=new ArrayDeque<>();
   q.add(node);
   while(q.size()>0){
     Node curr=q.remove();
     System.out.print(curr.data+" ");
    for(Node child:curr.children){
   q.add(child);
    }

   }
    System.out.print(".");
  
  
  }

//linewise by using two queue
 public static void levelOrderLinewise(Node node){
   
   Queue<Node> mainQ=new ArrayDeque<>();
   mainQ.add(node);
   while(mainQ.size()>0){
       Queue<Node> childQ=new ArrayDeque<>();
       while(mainQ.size()>0){
           Node curr=mainQ.remove();
           System.out.print(curr.data+" ");
           for(Node child:curr.children){
               childQ.add(child);
           }
         
       }
         mainQ=childQ;
       System.out.println();
   
   
   }
   
  }



//by using delimeter
public static void levelOrderLinewise(Node node){
   
   Queue<Node> mainQ=new ArrayDeque<>();
   mainQ.add(node);
   Node dummy=new Node();
   dummy.data=-1;
    mainQ.add(dummy);
   while(mainQ.size()>0){
      
      Node curr=mainQ.remove();
       
      
      if(curr.data== -1){
          System.out.println();
          if(mainQ.size()>1){
              mainQ.add(dummy);
          }
      }
          else{
              System.out.print( curr.data+" ");
              for(Node child: curr.children){
                  mainQ.add(child);
              }
          }
      }
   }
  




// by using counter
 public static void levelOrderLinewise(Node node){
   
   Queue<Node> mainQ=new ArrayDeque<>();
   mainQ.add(node);
 
   while(mainQ.size()>0){
      
      int counter=mainQ.size();
      for(int i=0;i<counter;i++){
          Node curr=mainQ.remove();
          System.out.print(curr.data+" ");
          for(Node child:curr.children){
              mainQ.add(child);
          }
      }
      System.out.println();
      }
   }
  
