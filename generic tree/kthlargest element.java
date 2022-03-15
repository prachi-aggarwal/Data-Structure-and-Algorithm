
  public static int kthLargest(Node node, int k){
      int ans=Integer.MAX_VALUE;
   for(int i=0;i<k;i++){
       floor=Integer.MIN_VALUE;
       ceilAndFloor(node,ans);
       ans=floor;
       
   } 
   return ans;
  }
