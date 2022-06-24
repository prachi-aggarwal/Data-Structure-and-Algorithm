class Solution {
    public int maxUncrossedLines(int[] nums1, int[] nums2) {
     
        int [] next=new int[nums2.length+1];
        for(int i=nums1.length-1;i>=0;i--){
            int [] curr=new int[nums2.length+1];
            for(int j=nums2.length-1;j>=0;j--){
                if(nums1[i]==nums2[j]){
                    curr[j]=next[j+1]+1;
                }
                else{
                    curr[j]=Math.max(next[j],curr[j+1]);
                }
            }
            next=curr;
        }
        
        return next[0];
        
        
        
        
        
        
        
        
    }
}