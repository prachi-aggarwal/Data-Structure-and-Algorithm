class Solution {
    public int wiggleMaxLength(int[] nums) {
     
        
        int [] inc=new int[nums.length];
        int [] dec=new int[nums.length];
        Arrays.fill(inc,1);
        Arrays.fill(dec,1);
        int maxlength=0;
        for(int i=0;i<nums.length;i++){
            for(int j=0;j<i;j++){
                if(nums[j]<nums[i]){
                    inc[i]=Math.max(inc[i],dec[j]+1);
                    
                }
                if(nums[j]>nums[i]){
                    dec[i]=Math.max(dec[i],inc[j]+1);
                }
            }
            maxlength=Math.max(maxlength,Math.max(dec[i],inc[i]));
            
        }
        return maxlength;
        
        
        
    }
}