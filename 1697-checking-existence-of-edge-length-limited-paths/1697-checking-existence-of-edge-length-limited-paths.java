class Solution {
   static class DSU {
    int[] parent;
    int[] rank;

    DSU(int n) {
        parent = new int[n + 1];
        Arrays.fill(parent, -1);

        rank = new int[n + 1];
        Arrays.fill(rank, 1);
    }

    public void union(int a, int b) {
        a = find(a);
        b = find(b);

        if (a == b)
            return;
        if (rank[a] >= rank[b]) {
            rank[a] += rank[b];
            parent[b] = a;
        } else {
            rank[b] += rank[a];
            parent[a] = b;
        }
    }

    public int find(int a) {
        if (parent[a] == -1)
            return a;
        return parent[a] = find(parent[a]);
    }
}

    static class query implements Comparable<query>{
        int idx;
        int a;
        int b;
        int threshold;
        query(int idx,int a ,int b,int threshold){
            this.idx=idx;
            this.a=a;
            this.b=b;
            this.threshold=threshold;
        }
        public int compareTo(query other){
           return this.threshold-other.threshold;
        }
        
        
    }
    
    
    
    public boolean[] distanceLimitedPathsExist(int n, int[][] edgeList, int[][] queries) {
       
        List<query> q=new ArrayList<>();
        for(int i=0;i<queries.length;i++){
            q.add(new query(i,queries[i][0],queries[i][1],queries[i][2]));
        }
     Collections.sort(q);
        
        Arrays.sort(edgeList,(a,b)->a[2]-b[2]);
        DSU sets=new DSU(n);
        int e=0;
        boolean [] arr=new boolean[queries.length];
        for(query pq:q){
            while(e<edgeList.length&&edgeList[e][2]<pq.threshold){
                sets.union(edgeList[e][0],edgeList[e][1]);
                 e++;
            }
            if(sets.find(pq.a)==sets.find(pq.b)){
                arr[pq.idx]=true;
            }
           
        }
        
       return arr; 
    }
}