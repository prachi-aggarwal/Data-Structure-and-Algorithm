class Solution {
    public List<List<Integer>> helper(int [] nums,int left,int right,int target){
        List<List<Integer>> result=new ArrayList<>();
        int start=left;
        while(left<right){
            int sum=nums[left]+nums[right];
            if(sum==target){
                if(left>start&&nums[left]==nums[left-1]){
                    left++;
                }
                else{
                    List<Integer> pair=new ArrayList<>();
                    pair.add(nums[left]);
                    pair.add(nums[right]);
                result.add(pair);
                    left++;
                    right--;
                }
                
            }
            else if(sum<target){
                left++;
            }
            else{
                right--;
            }
        }
        return result;
    }
    public List<List<Integer>> threeSum(int[] nums) {
       
        Arrays.sort(nums);
       
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        
        for(int i=0;i<nums.length;i++){
            if(i>0&&nums[i]==nums[i-1])continue;
            List<List<Integer>> pair=helper(nums,i+1,nums.length-1,-nums[i]);
            for(List<Integer> triplet:pair){
                triplet.add(0,nums[i]);
                result.add(triplet);
            }
        }
        
        
        
        
        return result;
        
//         for(int i=0;i<nums.length;i++){
//           int target=-(nums[i]);
            
//             // if(i<nums.length)
//             int left=nums[i]+1;
            
//             int right=nums.length-1;
//             while(left<=right){
//                 if(nums[left]+nums[right]==target){
//                     int start=left;
//                     if(left>start&&nums[left]==nums[left-1]){
//                         left++;
//                     }
//                     else{
//                     List<Integer> pair=new ArrayList<>();
//                         pair.add(nums[i]);
//                         pair.add(nums[left]);
//                         pair.add(nums[right]);
//                         result.add(pair);
//                         left++;right--;
//                     }
//                 }
//                 if(nums[left]+nums[right]<target){
//                     left++;
//                 }
//                  if(nums[left]+nums[right]>target){
//                     right--;
//                 }
//             }
            
        }
        
        
       
        
        
        // return result;
//         
    
}