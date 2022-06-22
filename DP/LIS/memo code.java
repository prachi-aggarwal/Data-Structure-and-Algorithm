class Solution {
    public int memo(int prev,int curr,int [][] dp,int [] nums){
        if(curr==nums.length){
            return 0;
        }
        if(dp[prev+1][curr]!=-1){
            return dp[prev+1][curr];
        }
        int yes=(prev==-1||nums[prev]<nums[curr])?memo(curr,curr+1,dp,nums)+1:0;
        int no=memo(prev,curr+1,dp,nums);
    return dp[prev+1][curr]=Math.max(yes,no);
    }
    public int lengthOfLIS(int[] nums) {
     int n=nums.length;
     int [][] dp=new int[n+1][n+1]; 
        for(int i=0;i<dp.length;i++){
            Arrays.fill(dp[i],-1);
        }
    
            return memo(-1,0,dp,nums);
    
        
        
        
        
        
        
        
        
        
        
    }
}
