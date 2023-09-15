class Solution {
    List<String> res;
    public void dfs(String src,  HashMap<String,PriorityQueue<String>> adj){
        while(adj.get(src).size()>0){
            String nbr=adj.get(src).remove();
            dfs(nbr,adj);
        }
        res.add(src);
        
    }
    public List<String> findItinerary(List<List<String>> tickets) {
       HashMap<String,PriorityQueue<String>> adj=new HashMap<>();
        for(List<String> ticket:tickets){
            if(adj.containsKey(ticket.get(0))==false){
                adj.put(ticket.get(0),new PriorityQueue<>());
            }
             if(adj.containsKey(ticket.get(1))==false){
                adj.put(ticket.get(1),new PriorityQueue<>());
            }
            adj.get(ticket.get(0)).add(ticket.get(1));
           
        }
        
        res=new ArrayList<>();
        dfs("JFK",adj);
        
        Collections.reverse(res);
        return res;
        
        
    }
}