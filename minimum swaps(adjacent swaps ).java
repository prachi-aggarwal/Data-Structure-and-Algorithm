
class Solution
{
      public int mergesort(int[] nums,int left,int right){
        if(left>=right)return 0;

        int mid=left+(right-left)/2;
     int leftcount=   mergesort(nums,left,mid);
        int rightcount=mergesort(nums,mid+1,right);
      int ans=  merge(nums,left,mid,mid+1,right);
      return leftcount+rightcount+ans;
    }
     public static int merge(int [] nums,int left,int mid,int nextmid,int right){
        int [] res=new int[mid-left+1+right-nextmid+1];
        int k=0;
        int ptr1=left;
        int ptr2=nextmid;
        int invcount=0;
        int count=0;
        while(ptr1<=mid&&ptr2<=right){
            if(nums[ptr1]>nums[ptr2]){
                res[k]=nums[ptr2];
                ptr2++;
                k++;
                invcount = invcount+mid-ptr1+1;

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

            return invcount;
    }
    //Function to find the minimum number of swaps required to sort the array.
    public int countSwaps(int nums[],int n)
    {
      
      return  mergesort(nums,0,nums.length-1);  // Code here
    }
}
