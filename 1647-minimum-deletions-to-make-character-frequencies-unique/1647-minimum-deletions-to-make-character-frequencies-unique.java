class Solution {
    public int minDeletions(String s) {
        int[] ch=new int [26];
        for(char c:s.toCharArray()){
            ch[c-'a']++;
        }
        HashSet<Integer> hs=new HashSet<>();
        int deletion=0;
        for(int i=0;i<ch.length;i++){
            int val=ch[i];
            while(val!=0&&hs.contains(val)){
                deletion++;
                val--;
                
            }
            // ch[i]=val;
            
            hs.add(val);
        }
           
            
        
        
    return deletion;
    }
}