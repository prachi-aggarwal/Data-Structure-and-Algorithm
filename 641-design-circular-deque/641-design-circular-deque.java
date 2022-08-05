class MyCircularDeque {
int size;
    int [] arr;
    int rear,front;
    public MyCircularDeque(int k) {
      rear=0;front=0;
        size=0;
       arr=new int[k];  
    }
    
    public boolean insertFront(int value) {
    if(size==arr.length)return false;
        arr[front=(front-1+arr.length)%arr.length]=value;
        size++;
        
        return true;
    }
    
    public boolean insertLast(int value) {
      if(size==arr.length)return false;
        arr[rear=(rear+arr.length)%arr.length]=value;
        rear++;
        size++;
        
        
        return true;
    }  
    
    
    public boolean deleteFront() {
     if(size==0)return false;
        size--;
        front++;
        return true;
    }
    
    public boolean deleteLast() {
        if(size==0)return false;
       rear--;
       size--; 
        return true;
    }
    
    public int getFront() {
       if(size==0)return -1;
        return arr[front%arr.length];
    }
    
    public int getRear() {
       if(size==0)return -1;
        return arr[(rear-1+arr.length)%arr.length]; 
    }
    
    public boolean isEmpty() {
      if(size==0)return true;
        return false;
    }
    
    public boolean isFull() {
     if(size==arr.length)return true;
        return false;
    }
}

/**
 * Your MyCircularDeque object will be instantiated and called as such:
 * MyCircularDeque obj = new MyCircularDeque(k);
 * boolean param_1 = obj.insertFront(value);
 * boolean param_2 = obj.insertLast(value);
 * boolean param_3 = obj.deleteFront();
 * boolean param_4 = obj.deleteLast();
 * int param_5 = obj.getFront();
 * int param_6 = obj.getRear();
 * boolean param_7 = obj.isEmpty();
 * boolean param_8 = obj.isFull();
 */