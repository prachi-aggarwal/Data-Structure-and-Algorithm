class FrontMiddleBackQueue {
  
 Deque<Integer> q1=new ArrayDeque<>();
    Deque<Integer> q2=new ArrayDeque<>();
     public void balance(){
         
         if((q1.size()+q2.size())%2==0){
             while(q1.size()>q2.size()){
                 int val=q1.getLast();
                 q1.removeLast();
                 q2.addFirst(val);
             }
              while(q1.size()<q2.size()){
                 int val=q2.getFirst();
                 q2.removeFirst();
                 q1.addLast(val);
             }
         }
         else{
         while(q1.size()<q2.size()+1){
             int val=q2.getFirst();
             q2.removeFirst();
             q1.addLast(val);
             
         }
                  while(q1.size()>q2.size()+1){
             int val=q1.getLast();
             q1.removeLast();
             q2.addFirst(val);
             
         }
         
         }
     }
    
    
    
    
    public void pushFront(int val) {
      q1.addFirst(val);
        balance();
        
    }
    
    public void pushMiddle(int val) {
        if(q1.size()>q2.size()){
            while(q1.size()>q2.size()){
                int vl=q1.removeLast();
                q2.addFirst(vl);
            }
        }
      q1.add(val);
        balance();
    }
    
    public void pushBack(int val) {
      q2.addLast(val);
        balance();
    }
    
    public int popFront() {
        if(q1.size()+q2.size()==0)return -1;
       int val= q1.removeFirst();
        balance();
        return val;
        
    }
    
    public int popMiddle() {
         if(q1.size()+q2.size()==0)return -1;
    int val= q1.getLast();
        q1.removeLast();
        balance();
        return val;
    }
    
    public int popBack() {
         if(q1.size()+q2.size()==0)return -1;
        if(q2.size()==0){
           int val= q1.getLast();
            q1.removeLast();
            return val;
        }
        else{
       int val= q2.getLast();
            q2.removeLast();
        balance();
        return val;
        }
    }
}

/**
 * Your FrontMiddleBackQueue object will be instantiated and called as such:
 * FrontMiddleBackQueue obj = new FrontMiddleBackQueue();
 * obj.pushFront(val);
 * obj.pushMiddle(val);
 * obj.pushBack(val);
 * int param_4 = obj.popFront();
 * int param_5 = obj.popMiddle();
 * int param_6 = obj.popBack();
 */