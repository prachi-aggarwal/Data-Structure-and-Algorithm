class Solution {
    public List<Integer> largestDivisibleSubset(int[] nums) {
      List<Integer> res=new ArrayList<>();
        Arrays.sort(nums);
        int [] dp=new int [nums.length];
        int [] prev=new int [nums.length];
        Arrays.fill(dp,1);
        Arrays.fill(prev,-1);
        int max=0;
        int maxLis=0;
        for(int i=1;i<nums.length;i++){
            for(int j=0;j<i;j++){
                if(nums[i]%nums[j]==0&&dp[i]<dp[j]+1){
                    dp[i]=dp[j]+1;
                    prev[i]=j;
                    
                }
            }
            if(dp[i]>max){
            max=Math.max(dp[i],max);
           
            maxLis=i;
            }
            
        }
        
        // for(int i=0;i<nums.length;i++){
          while(maxLis!=-1){
              res.add(nums[maxLis]);
              maxLis=prev[maxLis];
          }  
        
        
        return  res;
        
    }
}