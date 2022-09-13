class Trie {
     static class Node{
        private Node [] children=new Node[26];
        private boolean isEnd=false;
         public Node get(char ch){
             return children[ch-'a'];
         }
         public void set(char ch){
             children[ch-'a']=new Node();
         }
         public boolean contains(char ch){
             return (children[ch-'a']!=null);
         }
         public boolean getEnd(){
             return isEnd;
         }
         public void setEnd(){
            this.isEnd=true;  
         }
         
         
     }

    Node root;
    public Trie() {
      root=new Node();  
    }

    
    public void insert(String word) {
        Node curr=root;
       for(int i=0;i<word.length();i++){
           char ch=word.charAt(i);
           if(curr.contains(ch)==false){
               curr.set(ch);
           }
           curr=curr.get(ch);
       } 
         curr.setEnd();
    }
    
    public boolean search(String word) {
      Node curr=root;
       for(int i=0;i<word.length();i++){
           char ch=word.charAt(i);
           if(curr.contains(ch)==false){
                   return false;
           }
           curr=curr.get(ch);
       } 
              if(curr.getEnd())return true;
        return false;
    }
    
    public boolean startsWith(String word) {
         Node curr=root;
       for(int i=0;i<word.length();i++){
           char ch=word.charAt(i);
           if(curr.contains(ch)==false){
                   return false;
           }
           curr=curr.get(ch);
       } 
             
        return true;  
    }
}

/**
 * Your Trie object will be instantiated and called as such:
 * Trie obj = new Trie();
 * obj.insert(word);
 * boolean param_2 = obj.search(word);
 * boolean param_3 = obj.startsWith(prefix);
 */