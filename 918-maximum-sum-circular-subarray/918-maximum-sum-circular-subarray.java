class Solution {
    public int maxSubarraySumCircular(int[] nums) {
    int max=Integer.MIN_VALUE;
        int total=0;
        int curr=0;
        for(int i=0;i<nums.length;i++){
            total+=nums[i];
            curr=Math.max(curr+nums[i],nums[i]);
            max=Math.max(max,curr);
        }
        int mincurr=Integer.MAX_VALUE;
        int min=0;
        for(int i=0;i<nums.length;i++){
           min=Math.min(min+nums[i],nums[i]);
            mincurr=Math.min(min,mincurr);
        }
        
        int ans=Math.max(max,total-mincurr);
        
        return (ans>0)?ans:max;
    }
}