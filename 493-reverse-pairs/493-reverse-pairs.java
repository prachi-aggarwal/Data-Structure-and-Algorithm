class Solution {
    
     public int mergesort(int[] nums,int left,int right){
        if(left>=right)return 0;

        int mid=left+(right-left)/2;
     int leftcount=   mergesort(nums,left,mid);
        int rightcount=mergesort(nums,mid+1,right);
      int ans=  merge(nums,left,mid,mid+1,right);
      return leftcount+rightcount+ans;
    }
    public int invcount(int[] nums,int left,int mid,int nextmid,int right){
        int res=0;
         int ptr1=left;
        int ptr2=nextmid;
        
         while(ptr1<=mid&&ptr2<=right){
            if((long)nums[ptr1]>(long)2l*nums[ptr2]){
                
               res=res+mid-ptr1+1;
                ptr2++;
             
               

            }
            else{
               
                ptr1++;
                
            }

        }
        return res;
    }
    
    
        public  int merge(int [] nums,int left,int mid,int nextmid,int right){
        int [] res=new int[mid-left+1+right-nextmid+1];
        int k=0;
        int ptr1=left;
        int ptr2=nextmid;
       
        int count=invcount(nums,left,mid,nextmid,right);
        while(ptr1<=mid&&ptr2<=right){
            if(nums[ptr1]>nums[ptr2]){
                res[k]=nums[ptr2];
                ptr2++;
                k++;
               

            }
            else{
                res[k]=nums[ptr1];
                ptr1++;
                k++;  
            }

        }
        while(ptr1<=mid){

                res[k]=nums[ptr1];
                ptr1++;
                k++;
            }

    while(ptr2<=right){
                        res[k]=nums[ptr2];
                ptr2++;
                k++;

    }
        for(int i=left;i<=right;i++){
            nums[i]=res[i-left];        }

            return count;
    }

    
    
    public int reversePairs(int[] nums) {
     
        
        
        return mergesort(nums,0,nums.length-1);
        
        
        
        
    }
}