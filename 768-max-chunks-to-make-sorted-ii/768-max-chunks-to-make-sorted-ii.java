class Solution {
    public int maxChunksToSorted(int[] arr) {
       int count =0;
        int [] min=new int [arr.length+1];
        min[arr.length]=Integer.MAX_VALUE;
        for(int i=arr.length-1;i>=0;i--){
            min[i]=Math.min(arr[i],min[i+1]);
            }
        int max=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            max=Math.max(max,arr[i]);
           if( max<=min[i+1]){
               count++;
               max=arr[i];
           }
            
        }
        
        return count;
        
    }
}