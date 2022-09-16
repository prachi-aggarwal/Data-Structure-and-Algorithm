class Solution {
    public int check(int [] nums,int target){
               int [] dp=new int[target+1];
        dp[0]=1;
        for(int i=1;i<=nums.length;i++){
            int[] dpnew =new int[target+1];
            for(int j=0;j<=target;j++){
                int yes=(j>=nums[i-1])?dp[j-nums[i-1]]:0;
                           int no=dp[j];
                         dpnew[j]=yes+no;
                
            }
            dp=dpnew;
        }
                           return dp[target];
    }
    public int findTargetSumWays(int[] nums, int target) {
         int total=0;
        for(int num:nums){
            total+=num;
        }
        if(target>total)return 0;
        if((total-target)%2==1)return 0;
        return check(nums,(total-target)/2);
    }
}