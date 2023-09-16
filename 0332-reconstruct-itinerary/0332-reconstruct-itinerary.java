class Solution {
    
    public void dfs( HashMap<String,PriorityQueue<String>> hm, List<String> path,String src){
        
        
       while(hm.get(src).size()>0){
           String nbr=hm.get(src).poll();
           dfs(hm,path,nbr);
       }
        path.add(src);
        
    }
    public List<String> findItinerary(List<List<String>> tickets) {
        HashMap<String,PriorityQueue<String>> hm=new HashMap<>();
        for(List<String> arr:tickets){
            String src=arr.get(0);
            String dest=arr.get(1);
            if(hm.containsKey(src)==false){
               hm.put(src,new PriorityQueue<>());
            }
             if(hm.containsKey(dest)==false){
               hm.put(dest,new PriorityQueue<>());
            }
            hm.get(src).add(dest);
            
        }
         List<String> path=new ArrayList<>();
        
        dfs(hm,path,"JFK");
        
        
        Collections.reverse(path);
        return path;
        
        
        
        
        
        
    }
}