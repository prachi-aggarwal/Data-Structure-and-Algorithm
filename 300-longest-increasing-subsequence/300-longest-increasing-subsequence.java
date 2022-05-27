class Solution {
    public int tabulation(int [] dp,int [] nums,int idx){
        // ans=0;
        for(int i=0;i<idx;i++){
            if(nums[idx]>nums[i]){
                int curr=dp[i]+1;
                dp[idx]=Math.max(curr,dp[idx]);
            }
        }
        return dp[idx];
    }
    public int lengthOfLIS(int[] nums) {
        int [] dp= new int[nums.length];
        for(int i=0;i<nums.length;i++){
            dp[i]=1;
        }
        int ans=1;
        for(int i=1;i<nums.length;i++){
           ans=Math.max(ans, tabulation(dp,nums,i));
        }
        return ans;
    }
}