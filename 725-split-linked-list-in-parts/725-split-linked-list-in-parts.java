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
    public ListNode[] splitListToParts(ListNode head, int k) {
       int len=0;
        ListNode curr=head;
        while(curr!=null){
            len++;
            curr=curr.next;
        }
        int length=len/k;
        int distribute=len%k;
        curr=head;
        ListNode [] ans=new ListNode[k];
        int i=0;
        ListNode prev=curr;
        while(curr!=null&&i<k){
            ans[i]=curr;
        for(int j=0;j<length+(distribute>0?1:0);j++){
            prev=curr;
            curr=curr.next;
        }
            prev.next=null;
            i++;
            distribute--;
        }
        return ans;
    }
}