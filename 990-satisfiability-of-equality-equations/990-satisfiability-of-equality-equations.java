class Solution {
   
    static class DSU{
        int [] parent;
        int [] rank;
    DSU(int n){
        parent=new int[n];
        rank=new int [n];
        Arrays.fill(parent,-1);
        Arrays.fill(rank,1);
    }
        public void union(int a,int b){
            int pa=find(a);
            int pb=find(b);
            if(pa==pb)return;
            if(rank[pa]>rank[pb]){
                parent[pb]=pa;
                rank[pa]+=rank[pb];
            }
            else{
               parent[pa]=pb;
                rank[pb]+=rank[pa];     
            }
        }
        public int find(int a){
            if(parent[a]==-1)return a;
            return parent[a]=find(parent[a]);
        }
    }
    public boolean equationsPossible(String[] equations) {
        DSU sets=new DSU(26);
       
        for(String str:equations){
            int a=str.charAt(0)-'a';
            int b=str.charAt(3)-'a';
            if(str.charAt(1)== '='){
                sets.union(a,b);
            }
            
            
        }
         for(String str:equations){
            int a=str.charAt(0)-'a';
            int b=str.charAt(3)-'a';
            if(str.charAt(1)=='!'){
                if(sets.find(a)==sets.find(b))return false;
            }
            
        }
        
        
            return true;
    }
}