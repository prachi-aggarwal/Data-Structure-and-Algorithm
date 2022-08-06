class CustomStack {
int [] arr;
    int [] inc;
    int size=-1;
    public CustomStack(int maxSize) {
        arr=new int[maxSize];
        inc=new int[maxSize];
    }
    
    public void push(int x) {
     if(arr.length-1==size)return;
        size++;
        arr[size]=x;
    // size++;
    }
    
    public int pop() {
        if(size==-1)return -1;
        int val= arr[size]+inc[size];
        if(size-1>=0){
        inc[size-1]+=inc[size];
          
        }
        inc[size]=0;
         size--;
        return val;
     
    }
    
    public void increment(int k, int val) {
    if(size==-1)return;
        k=Math.min(k,size+1);
       
            inc[k-1]+=val;
       
    }
}

/**
 * Your CustomStack object will be instantiated and called as such:
 * CustomStack obj = new CustomStack(maxSize);
 * obj.push(x);
 * int param_2 = obj.pop();
 * obj.increment(k,val);
 */