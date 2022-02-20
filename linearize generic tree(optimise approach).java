  public static Node linearize(Node node){
    if(node==null){
      return null;
    }
    ArrayList<Node> tails=new ArrayList<>();
    for(Node child:node.children){
      tails.add(linearize(child));

      }
      for(int i=node.children.size()-1;i>0;i--){
        Node leftchild=tails.get(i-1);
        Node rightchild =node.children.get(i);
        leftchild.children.add(rightchild);
        node.children.remove(i);
      }

   
if(tails.size()==0)return node;
return tails.get(tails.size()-1);


