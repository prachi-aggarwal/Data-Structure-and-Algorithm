/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
    public Node copyRandomList(Node head) {
        if(head==null)return null;
        Node curr=head;
        
        while(curr!=null){
            Node n =new Node(curr.val);
             n.next=curr.next;
            curr.next=n;
           curr=n.next;
        }
      
        
        curr=head;
        Node n;
        while(curr!=null){
                 n=curr.next;
           
            Node random=curr.random;
            
                n.random =(random!=null)?random.next:null;
          
            curr=n.next;
           
            
        }
        Node cp=head.next;
        curr=head;
        Node tail;
        while(curr!=null){
            tail=curr.next;
          curr.next=tail.next;
            curr=curr.next;
            if(curr!=null){
                tail.next=curr.next;
            }
        }
        
        
        return cp;
        
        
        
        
        
    }
}