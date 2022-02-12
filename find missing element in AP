class Solution {
    int findMissing(int[] arr, int n) {
         int low =0;
        int high = n-1;
        int a=arr[0];
        int ans=-1;
        int d=(arr[high]-arr[low])/n;
        while(low<=high){
            int mid=low+(high-low)/2;
            if((a+mid*d)<arr[mid]){
                ans=a+mid*d;
                high=mid-1;
            }
          if(a+mid*d==arr[mid]){
                low=mid+1;
            }
            
        }
            return ans;
    }
}
