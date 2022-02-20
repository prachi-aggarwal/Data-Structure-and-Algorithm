class Solution {
    public void mergesort(int[] nums,int left,int right){
        if(left>=right)return;
    
        int mid=left+(right-left)/2;
        mergesort(nums,left,mid);
        mergesort(nums,mid+1,right);
        merge(nums,left,mid,mid+1,right);
    }
    public void merge(int [] nums,int left,int mid,int nextmid,int right){
        int [] res=new int[mid-left+1+right-nextmid+1];
        int k=0;
        int ptr1=left;
        int ptr2=nextmid;
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
        
    }
    
    
    
    public int[] sortArray(int[] nums) {
        mergesort(nums,0,nums.length-1);
        return nums;
   
    }
}
