class Solution {
    public int longestMountain(int[] nums) {
        int [] dp1=new int[nums.length];
        int [] dp2=new int [nums.length];
        Arrays.fill(dp1,1);
        Arrays.fill(dp2,1);
        int curr=0;
        
        for(int i=0;i<nums.length;i++){
            // for(int j=0;j<i;j++){
                if(i>0&&nums[i]>nums[i-1]){
                  // curr++;
                    dp1[i]=dp1[i-1]+1;
                }
              // dp1[i]=Math.max(dp1[i],curr);
            
        }
        int count=0;
           for(int i=nums.length-1;i>=0;i--){
            // for(int j=nums.length-1;j>i;j--){
                if(i<nums.length-1&&nums[i]>nums[i+1]){
                                      dp2[i]=dp2[i+1]+1;
                }
             // dp2[i]=Math.max(dp2[i],count);
        }
        
        int minele=0;
        for(int i=0;i<nums.length;i++){
            int sum=dp1[i]+dp2[i]-1;
            if(dp1[i]>1&&dp2[i]>1)
            minele=Math.max(sum,minele);
        }
        
        return minele;  
    }
}