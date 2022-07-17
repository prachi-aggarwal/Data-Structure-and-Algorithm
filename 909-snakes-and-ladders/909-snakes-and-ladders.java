class Solution {
    class pair{
        int src;
        int dist;
        pair(int src,int dist){
            this.src=src;
            this.dist=dist;
        }
    }
    
    public int bfs(ArrayList<Integer>[] adj){
        Queue<pair> q=new ArrayDeque<>();
        q.add(new pair(1,0));
        int [] vis=new int[adj.length+1];
        Arrays.fill(vis,-1);
        while(q.size()>0){
            pair front=q.remove();
            if(vis[front.src]!=-1)continue;
            vis[front.src]=front.dist;
            for(Integer nbr:adj[front.src]){
                q.add(new pair(nbr,front.dist+1));
            }
            
        }
        return vis[adj.length-1];
    }
    
    public int snakesAndLadders(int[][] board) {
        
        ArrayList<Integer> one=new ArrayList<>();
        one.add(0);
        int level=0;
        int cell=1;
        for(int i=board.length-1;i>=0;i--){
            if(level%2==0){
            for(int j=0;j<board[0].length;j++){
                if(board[i][j]!=-1){
                   one.add(board[i][j]); 
                }else
                    one.add(cell);
                cell++;
                
            }
            }
            else{
               for(int j=board[0].length-1;j>=0;j--){
                if(board[i][j]!=-1){
                   one.add(board[i][j]); 
                }else
                    one.add(cell);
                   cell++;
            }
        }
        
        
            level++;
        
    }
        
        ArrayList<Integer>[] adj=new ArrayList[board.length*board[0].length+1];
        
        for(int i=1;i<=board.length*board[0].length;i++){
            adj[i]=new ArrayList<>();
            for(int d=1;d<=6&&i+d<=board.length*board[0].length;d++){
                if(i==one.get(i+d))continue;
            adj[i].add(one.get(i+d));
                }
        }
        
       return bfs(adj);
        
        
}
}