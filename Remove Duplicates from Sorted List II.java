class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        if(head==null)return null;
       ListNode dummy=new ListNode(-1);
        ListNode tail=dummy;
         ListNode curr=head.next;
         
        while(curr!=null){
            boolean flag=false;
          
            while(curr!=null&&head.val==curr.val&&head!=curr){
            
                flag=true;
                curr=curr.next;
            }
             
           
                 if(flag==false){
              tail.next=head;
                tail=head;
               
            }
            head=curr;
            if(curr!=null)
            curr=curr.next;
            
                
           
           
        }
        tail.next=head;
        tail=head;
        if(tail!=null)
        tail.next=null;
        return dummy.next;
        
    }
    }
