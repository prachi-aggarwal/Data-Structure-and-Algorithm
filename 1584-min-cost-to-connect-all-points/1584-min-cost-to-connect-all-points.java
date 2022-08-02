class Solution {
     public static class pair implements Comparable<pair> {
        int idx;
        int weight;

        pair(int idx, int weight) {
            this.idx = idx;
            this.weight = weight;
        }

        public int compareTo(pair other) {
            return this.weight - other.weight;
        }
    }
    public int minCostConnectPoints(int[][] points) {
      
        
        int cost=0;
        int count=0;
        
        PriorityQueue<pair> pq=new PriorityQueue<>();
        pq.add(new pair(0,0));
        boolean [] vis=new boolean[points.length];
        while(pq.size()>0&&count<points.length){
            pair front=pq.remove();
            if(vis[front.idx]==true){
                continue;
            }
            
            count++;
            vis[front.idx]=true;
            cost=cost+front.weight;
           for(int i=0;i<points.length;i++){
               if(front.idx==i)continue;
               int dis=Math.abs(points[front.idx][0]-points[i][0])+Math.abs(points[front.idx][1]-points[i][1]);
               pq.add(new pair(i,dis));
           }
        }
 return cost;
       
    }
}