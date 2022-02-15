  public void swap(int [] nums,int i,int j){
        int temp=nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
    }
    public void merge(int[] nums1, int m, int[] nums2, int n) {
      for(int i=m;i<m+n;i++){
          nums1[i]=nums2[i-m];
      }  
        
    double gap=(m+n)/2.0;
        for(double i=gap;i>0;i=i/2.0){
          int start=(int)Math.ceil(i);
            for(int k=0 ,j=start;j<nums1.length;j++,k++){
                if(nums1[k]>nums1[j])swap(nums1,k,j);
                
               
            }
            if(start==1)break;
        }
        
        
    
