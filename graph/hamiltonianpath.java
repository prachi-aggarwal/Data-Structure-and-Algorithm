//User function Template for Java
class Solution 
{  
    // static boolean path=false;
    boolean check(int N, int M, ArrayList<ArrayList<Integer>> Edges) 
    { 
        HashMap<Integer,List<Integer>> graph=new HashMap<>();
        for(int i=1;i<=N;i++){
            graph.put(i,new ArrayList<>());
        }
    for(ArrayList<Integer> edges:Edges){
       graph.get(edges.get(0)).add(edges.get(1));
          graph.get(edges.get(1)).add(edges.get(0));
    }
        boolean [] vis=new boolean [N+1];
      for(int i=1;i<N+1;i++){
          if(!vis[i]){
            boolean res=  dfs(graph,i,vis,0,false,M);
            if(res==true)return true;
          }
      }
          return false;
        
    }
    
     static boolean dfs(HashMap<Integer,List<Integer>> graph,int i,boolean []  vis,int viscount,boolean path,int M){
     
     if(viscount== graph.size()-1){
          
          return true;
     }
     
     vis[i]=true;
     viscount++;
     for(int j:graph.get(i)){
         if(!vis[j]){
         boolean res=dfs(graph,j,vis,viscount,path,M);
         if(res==true)return true;
         }
     }
     
     
     vis[i]=false;
      return false;
       
    }
   
} 
