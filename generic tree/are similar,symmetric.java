
 
// similar
public static boolean areSimilar(Node n1, Node n2) {
      if(n1.children.size()!=n2.children.size())return false;
      for(int i=0;i<n1.children.size();i++){
          Node c1=n1.children.get(i);
          Node c2=n2.children.get(i);
        boolean ans =areSimilar(c1,c2);
        if(!ans){
            return ans;
        }
      }
return true;
   

  }



