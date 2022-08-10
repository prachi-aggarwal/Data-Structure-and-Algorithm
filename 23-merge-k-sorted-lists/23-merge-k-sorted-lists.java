/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode mergeKLists(ListNode[] lists) {
        PriorityQueue<ListNode> pq=new PriorityQueue<>((o1,o2)->{
          return o1.val-o2.val;  
        });
        ListNode dummy=new ListNode(-1);
        ListNode prev=dummy;
        for(int i=0;i<lists.length;i++){
            
           if(lists[i]!=null){
               pq.add(lists[i]);
           }   
            
            
        }
     
        while(pq.size()>0){
           ListNode curr=pq.remove();
            prev.next=curr;
            prev=prev.next;
             if(curr.next!=null){
          pq.add(curr.next);
      } 
        }
        
      
      return   dummy.next;
        
        
        
    }
}