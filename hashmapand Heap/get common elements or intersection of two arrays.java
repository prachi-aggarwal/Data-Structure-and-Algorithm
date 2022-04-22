class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
     
        HashMap<Integer,Boolean> hm=new HashMap<>();
        for(int i=0;i<nums1.length;i++){
            hm.put(nums1[i],true);
        }
HashMap<Integer,Boolean> intersect=new HashMap<>();
        for(int i=0;i<nums2.length;i++){
            if(hm.containsKey(nums2[i])){
                intersect.put(nums2[i],true);
                hm.put(nums2[i],false);
            }
            
        }
        int [] result =new int[intersect.size()];
                    int i=0;
        for(Integer number:intersect.keySet()){
            result[i++]=number;
        }
            
        return result;
        
        
        
        
         
        
        
        
    }
}
