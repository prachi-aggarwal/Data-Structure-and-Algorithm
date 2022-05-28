class Solution {
    public int minimumMountainRemovals(int[] nums) {
      
        int [] dp1=new int[nums.length];
        int [] dp2=new int [nums.length];
        Arrays.fill(dp1,1);
        Arrays.fill(dp2,1);
        for(int i=0;i<nums.length;i++){
            for(int j=0;j<i;j++){
                if(nums[i]>nums[j]){
                    dp1[i]=Math.max(dp1[i],dp1[j]+1);
                }
            }
        }
           for(int i=nums.length-1;i>=0;i--){
            for(int j=nums.length-1;j>i;j--){
                if(nums[i]>nums[j]){
                    dp2[i]=Math.max(dp2[i],dp2[j]+1);
                }
            }
        }
        
        int minele=0;
        for(int i=0;i<nums.length;i++){
            int sum=dp1[i]+dp2[i]-1;
            if(dp1[i]>1&&dp2[i]>1)
            minele=Math.max(sum,minele);
        }
        
        return nums.length-minele;
    }
}