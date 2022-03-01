class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        
        
               
      HashMap<Integer,Integer> freq=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int ch=nums[i];
            freq.put(ch,freq.getOrDefault(ch,0)+1);
        }
        
        TreeSet<Integer>[] bucket = new TreeSet[nums.length+1];
        for(int i=0;i<bucket.length;i++){
            bucket[i]=new TreeSet<>();
        }
        for(Integer ch:freq.keySet()){
            int val=freq.get(ch);
            bucket[val].add(ch);
        }
       int [] res= new int[k];
       int idx=k-1;
        for(int i=bucket.length-1;i>=0;i--){
           for(Integer ch:bucket[i]){
          if(idx<0)return res;
                res[idx]=ch;
               idx--;
            
           }
            
        }
        return res;
          
        
        
        
        
        
    }
}