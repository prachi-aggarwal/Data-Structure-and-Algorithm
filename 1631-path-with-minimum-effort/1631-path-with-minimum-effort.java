class Solution {
    public class pair implements Comparable<pair>{
        int nr;
        int nc;
        int weight;
        public pair(int nr,int nc,int weight){
            this.nr=nr;
            this.nc=nc;
            this.weight=weight;
        }
        public int compareTo(pair o){
            return this.weight-o.weight;
        }
    }
    int [][] dir={{0,1},{0,-1},{1,0},{-1,0}};
    public int minimumEffortPath(int[][] heights) {
     PriorityQueue<pair> pq=new PriorityQueue<>();
        pq.add(new pair(0,0,0));
        while(pq.size()>0){
            pair front=pq.remove();
            int r=front.nr;
            int c=front.nc;
            int weight=front.weight;
            if(heights[r][c]==-1)continue;
            if(r==heights.length-1&&c==heights[0].length-1)return weight;
        
            for(int i=0;i<4;i++){
                int nr=r+dir[i][0];
                int nc=c+dir[i][1];
                if(nr>=heights.length||nc>=heights[0].length||nc<0||nr<0)continue;
                int newweight=Math.max(weight,Math.abs(heights[nr][nc]-heights[r][c]));
                pq.add(new pair(nr,nc,newweight));
                
                
                
            }
            heights[r][c]=-1;
            
            
            
            
            
        }
        return 0;
    }
}