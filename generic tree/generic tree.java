
  public static void mirror(Node node){
      if(node.children.size()==0) return;
 
      for(Node child:node.children){
          mirror(child);
          
    
    
      }
       Collections.reverse(node.children);
   
  
    
    
    
  }
