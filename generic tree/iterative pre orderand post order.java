  public static void IterativePreandPostOrder(Node node) {
    Stack<Pair> stk=new Stack<>();
    Pair root =new Pair(node,-1);
    stk.push(root);
    ArrayList<Integer> preorder =new ArrayList<>();
    ArrayList<Integer> postorder =new ArrayList<>();
    while(stk.size()>0){
        Pair parent=stk.peek();
        if(parent.state==-1){
            preorder.add(parent.node.data);
           parent.state++;
           
        }
        else if(parent.node.children.size()==parent.state){
            postorder.add(parent.node.data);
            stk.pop();
        }
        else{
            Pair child=new Pair(parent.node.children.get(parent.state),-1);
            stk.push(child);
            parent.state++;
            
        }
    }
    for(int i=0;i<preorder.size();i++){
        System.out.print(preorder.get(i)+" ");
    }
    System.out.println();
    for(int i=0;i<postorder.size();i++){
        System.out.print(postorder.get(i)+" ");
    }
  }
