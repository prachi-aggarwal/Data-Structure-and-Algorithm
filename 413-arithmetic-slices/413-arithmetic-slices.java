class Solution {
    public int numberOfArithmeticSlices(int[] nums) {
        if(nums.length<3)return 0;
    
       
        int curr=2;
        // int maxlength=0;
        int count=0;
         int diff=nums[1]-nums[0];
        for(int i=2;i<nums.length;i++){
            
                
                if(nums[i]-nums[i-1]==diff){
                    curr++;
                }
            else{
                curr=2;// count++;
                diff=nums[i]-nums[i-1];
                
            }
            // maxlength=Math.max(curr,maxlength);
            if(curr>=3){
                count =count+(curr-2);
            }
            
        }
        
        
        
        return count;
        
        
        
        
        
        
        
        
    }
}