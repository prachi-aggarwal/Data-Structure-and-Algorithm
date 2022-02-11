class Complete{
    
   
    // Function for finding maximum and value pair
    public static int search (int arr[], int n, int x, int k) {
        int idx=0;
        while(idx<n){
            if(arr[idx]==x)return idx;
            int minjump=Math.abs(x-arr[idx])/k;
            if(minjump==0)minjump=1;
            idx=idx+minjump;
        }
          return -1;
    
    }
  
    
}
