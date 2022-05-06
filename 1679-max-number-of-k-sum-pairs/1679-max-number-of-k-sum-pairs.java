class Solution {
    public int maxOperations(int[] nums, int k) {
     
        Arrays.sort(nums);
        int count =0;
        int left=0;
        int right=nums.length-1;
        while(left<right){
            if(nums[left]+nums[right]>k){
                right--;
            }
         else  if(nums[left]+nums[right]<k){
                left++;
            }
            else{
                left++;right--;
                count++;
            }
        }
        
        return count;
        
        
        
        
    }
}