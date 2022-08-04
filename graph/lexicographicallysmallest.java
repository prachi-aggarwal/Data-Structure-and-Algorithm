import java.util.*;

public class Solution {
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
            if(pa<pb){
                parent[pb]=pa;
             
            }
            else{
               parent[pa]=pb;
                   
            }
        }
        public int find(int a){
            if(parent[a]==-1)return a;
            return parent[a]=find(parent[a]);
        }
    }
	public static String smallestString(String s, String t, String str) {
		DSU sets=new DSU(26);
        for(int i=0;i<s.length();i++){
            sets.union(s.charAt(i)-'a',t.charAt(i)-'a');
        }
        StringBuilder res=new StringBuilder();
        for(int i=0;i<str.length();i++){
           char ch=(char)(sets.find(str.charAt(i)-'a')+'a');
            res.append(ch);
            
        }
        return res.toString();
        
        
        
        
        
        
        
        
        
	}
}

