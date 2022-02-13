class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
       if(nums1.length>nums2.length){
           return findMedianSortedArrays(nums2,nums1);
       }
            
            
     int low=0;
        int high=nums1.length;
        int n=nums1.length+nums2.length;
            int N=(n+1)/2;
        while(low<=high){
            int mid=low+(high-low)/2;
            
            int aleft=(mid-1>=0)?nums1[mid-1]:Integer.MIN_VALUE;
                int bleft= (N-mid-1>=0)?nums2[N-mid-1]:Integer.MIN_VALUE;
                int aright=(mid<nums1.length)?nums1[mid]:Integer.MAX_VALUE;
                int bright=(N-mid<nums2.length)?nums2[N-mid]:Integer.MAX_VALUE;
            if(aleft<=bright&&bleft<=aright){
               if(n%2==1){
                    return Math.max(aleft,bleft);
                }
               
              
                    else{
                         int[] arr={aleft,bleft,aright,bright};
                Arrays.sort(arr);
                        double res=(arr[1]+arr[2])/2.0;
                        return res;
                    }
                }
                
                
            
            else{
                if(aleft>bright)high=mid-1;
                else{
                    low=mid+1;
                }
            }
        }
            
            
            
            
  
        
        
        
        
        
      return -1; 
         
        
        
        
    }
}