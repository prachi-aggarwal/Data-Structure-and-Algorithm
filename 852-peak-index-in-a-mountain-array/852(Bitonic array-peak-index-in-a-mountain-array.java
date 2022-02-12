class Solution {
    public int peakIndexInMountainArray(int[] arr) {
      
        int low=0;
        int high=arr.length-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            int lval=mid-1>0?arr[mid-1]:Integer.MIN_VALUE;
            int rval=mid+1<arr.length?arr[mid+1]:Integer.MIN_VALUE;
            if(arr[mid]>lval&&arr[mid]>rval)return mid;
            else if(arr[mid]>lval&&arr[mid]<rval)low=mid+1;
            else if(arr[mid]<lval&&arr[mid]>rval)high=mid-1;
            else{
                if(arr[low]<=arr[high])low++;/////to handle duplicate elements in bitonic array
                else high--;
            }
        }
        
        
        return -1;
        
    }
}
