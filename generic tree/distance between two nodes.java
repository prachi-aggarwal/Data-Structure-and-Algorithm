
  public static int distanceBetweenNodes(Node node, int d1, int d2){
  
  
   ArrayList<Integer> a1=nodeToRootPath(node,d1);
    ArrayList<Integer> a2=nodeToRootPath(node,d2);
    int i=a1.size()-1;
    int j=a2.size()-1;
    int LCA=-1;
    while(i>=0&&j>=0){
        if(a1.get(i)!=a2.get(j)){
            break;
        }
        LCA=a1.get(i);
        i--;
        j--;
        
    }
    return i+1j+1;
  
  }
