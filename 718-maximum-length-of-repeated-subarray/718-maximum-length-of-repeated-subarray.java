class Solution {
    public int findLength(int[] nums1, int[] nums2) {
         int [] next=new int[nums2.length+1];
        int max=0;
        for(int i=nums1.length-1;i>=0;i--){
            int [] curr=new int[nums2.length+1];
            for(int j=nums2.length-1;j>=0;j--){
                if(nums1[i]==nums2[j]){
                    curr[j]=next[j+1]+1;
                }
             max=Math.max(curr[j],max);   
            }
            next=curr;
        }
        
        return max;
          
    }
}