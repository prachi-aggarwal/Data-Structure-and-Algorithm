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
    public int getDecimalValue(ListNode head) {
        int count =0;
        ListNode temp=head;
         while(temp!=null){
            count++;
            temp=temp.next;
        }
        System.out.println(count);
        int res=0;
        
        while(head!=null){
            int digit =head.val;
            res=res+digit*(int)Math.pow(2,count-1);
            count--;
            head=head.next;
        }
        
        return res;
        
    }
}