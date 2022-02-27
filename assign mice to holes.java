public class Solution {
    public int mice(int[] A, int[] B) {
    Arrays.sort(A);
    Arrays.sort(B);
    int min=0;
    for(int i=0;i<A.length;i++){
        min=Math.max(min,Math.abs(A[i]-B[i]));
    }
return min;
  






    }
}
