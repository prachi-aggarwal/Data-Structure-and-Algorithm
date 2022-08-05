class MyCircularQueue {
int size;
    int [] arr;
    int rear,front;
    public MyCircularQueue(int k) {
        rear=0;front=0;
        size=0;
       arr=new int[k];
    }
    
    public boolean enQueue(int value) {
   
        if(size!=arr.length){
             arr[rear]=value;
        rear=(rear+1)%arr.length;
            size++;
        return true;
        
        }
        return false;
    }
    
    public boolean deQueue() {
      
        if(size!=0){
        front=(front+1)%arr.length;
             size--;
            
        return true;
        }
        return false;
        
    }
    
    public int Front() {
        if(size==0)return -1;
       return arr[front]; 
    }
    
    public int Rear() {
 if(size==0)return -1;
      return arr[(rear-1+arr.length)%arr.length];  
    }
    
    public boolean isEmpty() {
     if(size==0)return  true;
        return false;
    }
    
    public boolean isFull() {
     if(size==arr.length)return  true;
        return false;
    }   
    
}

/**
 * Your MyCircularQueue object will be instantiated and called as such:
 * MyCircularQueue obj = new MyCircularQueue(k);
 * boolean param_1 = obj.enQueue(value);
 * boolean param_2 = obj.deQueue();
 * int param_3 = obj.Front();
 * int param_4 = obj.Rear();
 * boolean param_5 = obj.isEmpty();
 * boolean param_6 = obj.isFull();
 */