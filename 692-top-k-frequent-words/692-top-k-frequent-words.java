class Solution {
    public List<String> topKFrequent(String[] nums, int k) {
         HashMap<String,Integer> freq=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            String ch=nums[i];
            freq.put(ch,freq.getOrDefault(ch,0)+1);
        }
        
        TreeSet<String>[] bucket = new TreeSet[nums.length+1];
        for(int i=0;i<bucket.length;i++){
            bucket[i]=new TreeSet<>();
        }
        for(String ch:freq.keySet()){
            int val=freq.get(ch);
            bucket[val].add(ch);
        }
      List<String> res=new ArrayList<>();
       int idx=k-1;
        for(int i=bucket.length-1;i>=0;i--){
           for(String ch:bucket[i]){
          if(idx<0)return res;
              res.add(ch);
               idx--;
            
           }
            
        }
        return res;
          
        
        
        
    }
}