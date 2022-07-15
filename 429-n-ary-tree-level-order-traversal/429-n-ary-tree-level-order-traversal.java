/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
};
*/

class Solution {
    public List<List<Integer>> levelOrder(Node root) {
        List<List<Integer>> res=new ArrayList<>();
        if(root==null) return res;
        Queue<Node> q=new ArrayDeque<>();
        q.add(root);
        Node marker=new Node(-1);
        q.add(marker);
        
         ArrayList<Integer> arr=new ArrayList<>();
        
        while(q.size()>1){
           
      Node curr=q.remove();
            
          
            if(curr==marker){
                q.add(marker);
                res.add(arr);
                arr=new ArrayList<>();
            }
            else{
                  arr.add(curr.val);
                for(Node child:curr.children){
                    q.add(child);
                }
                
            }
            
        }
        if(arr.size()>=1){
                res.add(arr);
            }
        
      return res;  
    }
}