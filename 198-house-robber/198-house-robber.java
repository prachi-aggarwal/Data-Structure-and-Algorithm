
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