class FreqStack {
     HashMap<Integer,Integer> hm;
      HashMap<Integer,ArrayList<Integer>> freq;
    
int max;
    public FreqStack() {
        hm=new HashMap<>();
        freq=new HashMap<>();
        
        max=0;
    }
    
    public void push(int val) {
        
        hm.put(val,hm.getOrDefault(val,0)+1);
        int curr=hm.get(val);
        if(freq.containsKey(hm.get(val))==false){
         freq.put(hm.get(val),new ArrayList<Integer>());   
        }
        
        freq.get(hm.get(val)).add(val);
        if(curr>max)max=curr;
        
    }
    
    public int pop() {
     
       ArrayList<Integer> arr= freq.get(max);
        int ans=arr.get(arr.size()-1);
        hm.put(ans,hm.get(ans)-1);
                arr.remove(arr.size()-1);
        if(arr.size()==0){freq.remove(max);
        
                                    max--;}
        else{

        freq.put(max,arr);
        }
        
        return ans;
    }
}

/**
 * Your FreqStack object will be instantiated and called as such:
 * FreqStack obj = new FreqStack();
 * obj.push(val);
 * int param_2 = obj.pop();
 */