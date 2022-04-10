class Solution {
    public static int maxsum(int [] nums,int [][] dp,int idx,int lasttaken){
        if(idx==nums.length){
            return 0;
        }
        if(dp[idx][lasttaken]!=-1){
            return dp[idx][lasttaken];
        }
        if(lasttaken==1){
            int ans= maxsum(nums,dp,idx+1,0);
            dp[idx][lasttaken]=ans;
            return ans;
        }
        int yes=nums[idx]+maxsum(nums,dp,idx+1,1);
         int no=maxsum(nums,dp,idx+1,0);
        int ans =Math.max(yes,no);
        dp[idx][lasttaken]=ans;
        return ans;
    }
    public int rob(int[] nums) {
        int [][] dp=new int[nums.length][2];
        for(int i=0;i<nums.length;i++)
        Arrays.fill(dp[i],-1);
         
        return maxsum(nums,dp,0,0);
        
     
        
        
    }
}



//tabulation
class Solution {
  
      
    public int rob(int[] nums) {
         int[] lasttaken=new int [nums.length];
            lasttaken[0]=nums[0];
        int[] lastnottaken=new int [nums.length];
        lastnottaken[0]=0;
        for(int i=1;i<nums.length;i++){
          lastnottaken[i]=Math.max(lasttaken[i-1],lastnottaken[i-1]); 
            lasttaken[i]=nums[i]+lastnottaken[i-1];
        }
     
        
       return Math.max(lasttaken[nums.length-1],lastnottaken[nums.length-1]); 
    }
}
