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
    public ListNode removeZeroSumSublists(ListNode head) {
        // if(head.val==0)return null;
        ListNode dummy=new ListNode(0);
        ListNode curr=dummy;
        dummy.next=head;
 HashMap<Integer,ListNode> hm=new HashMap<>();
        int sum=0;
      
        while(curr!=null){
            sum=sum+curr.val;
            if(hm.containsKey(sum)){
                ListNode node=hm.get(sum);
                int prefix=sum;
                node=node.next;
                while(node!=null&&node!=curr){
                   
               
                    prefix=prefix+node.val;
                     hm.remove(prefix);
                      node=node.next;
                   }
                
                
                hm.get(sum).next=curr.next;
                
            }
            else{
                hm.put(sum,curr);
            }
             
            curr=curr.next;
           
        }
        return dummy.next;
    }
}