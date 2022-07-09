class Solution {
    int [] mapping;
    public boolean bigger(String a,String b){
       
        int j=0;
          while(j<a.length()&&j<b.length()){
                   if(a.charAt(j)!=b.charAt(j)){
                       return mapping[a.charAt(j)-'a']>mapping[b.charAt(j)-'a'];
                       
                       
                   }
                   j++;
               }
         if(a.length()>b.length())return true;
        return false;
            }
    
    
    public boolean isAlienSorted(String[] words, String order) {
      mapping=new int[26];
        for(int i=0;i<order.length();i++){
        mapping[order.charAt(i)-'a']=i;
        }
            for(int i=1;i<words.length;i++){
                String a=words[i-1];
                String b=words[i];
                if(bigger(a,b))return false;
            }
        return true;
    }
}