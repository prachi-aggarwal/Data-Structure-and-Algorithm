class Solution {
    public int minMoves(int[] nums) {
       int minimum=Integer.MAX_VALUE;
        int sum=0;
        for(int i=0;i<nums.length;i++){
            minimum=Math.min(minimum,nums[i]);
            sum=sum+nums[i];
        }
        return sum-minimum*nums.length;
        
    }
}