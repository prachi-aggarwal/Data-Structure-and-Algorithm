class Solution {
    public List<Integer> partitionLabels(String s) {
      HashMap<Character,Integer> hm=new HashMap<>();
    List<Integer> res=new ArrayList<>();
        for(int i=0;i<s.length();i++){
            hm.put(s.charAt(i),i);
        }
        int max=0;
        int count =0;
        int prev=-1;
        for(int i=0;i<s.length();i++){
            max=Math.max(max,hm.get(s.charAt(i)));
            if(max==i){
                res.add(max-prev);
                prev=max;
            }
        }
       
        return res;
    }
}