class Solution {
    public int subarraySum(int[] nums, int k) {
     HashMap<Integer,Integer> hm=new HashMap<>();
        int pref=0;
        int res=0;
        hm.put(0,1);
        for(int i=0;i<nums.length;i++){
            pref+=nums[i];
            res+=hm.getOrDefault(pref-k,0);
            hm.put(pref,hm.getOrDefault(pref,0)+1);
        }
        return res;
    }
}