class Solution {
    public int missingNumber(int[] nums) {
       int n=nums.length;
        int sumofarr=n*(n+1)/2;
        int res=0;
        
        for(int sum:nums){
            res=res+sum;
                
        }
        return sumofarr-res;
        
        
    }
}