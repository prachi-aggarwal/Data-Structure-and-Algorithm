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
    public ListNode reverseBetween(ListNode head, int left, int right) {
        if(head.next==null||left==right)return head;
    ListNode prev1=null;
        ListNode dummy=new ListNode(-1);
        dummy.next=head;
        ListNode curr1=dummy;
       
       for(int i=0;i<left;i++){
           prev1=curr1;
           curr1=curr1.next;
       }
        ListNode pre2=prev1;
        ListNode curr2=curr1;
        
        for(int i=left;i<=right;i++){
           ListNode ahead=curr2.next;
            curr2.next=pre2;
            pre2=curr2;
            curr2=ahead;
            // System.out.println(curr.val);
        }
         prev1.next=pre2;
        // System.out.pri
          curr1.next=curr2;
       
        
    return dummy.next;
    }
}