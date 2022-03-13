
 public static ArrayList<Integer> nodeToRootPath(Node node, int data){

     if(node.data==data){
         ArrayList<Integer> res=new ArrayList<>();
         res.add(data);
         return res;
     }
     for(Node child:node.children){
         ArrayList<Integer> temp=nodeToRootPath(child,data);
         
         if(temp.size()>0){
             temp.add(node.data);
             return temp;
         }
         
     }
     return new ArrayList<>();


 }
