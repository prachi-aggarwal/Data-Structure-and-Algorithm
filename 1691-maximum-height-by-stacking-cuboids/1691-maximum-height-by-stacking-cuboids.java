class Solution {
    // public class comparator
    public int maxHeight(int[][] cuboids) {
       
            for(int[]a:cuboids)Arrays.sort(a);
        
        Arrays.sort(cuboids,new Comparator<int[]>(){
            public int compare(int[]a,int[]b){
                if(a[0]!=b[0])return a[0]-b[0];
                else
                if(a[1]!=b[1])return a[1]-b[1];
                return a[2]-b[2];
            }
        });
        int [] dp=new int[cuboids.length];
       
        
        int max=0;

        for(int i=0;i<cuboids.length;i++){
            dp[i]=cuboids[i][2];
            for(int j=0;j<i;j++){
                if(cuboids[i][0]>=cuboids[j][0]&&cuboids[i][1]>=cuboids[j][1]&&cuboids[i][2]>=cuboids[j][2]){
                    
                    dp[i]=Math.max(dp[j]+cuboids[i][2],dp[i]);
                }
            }
           max=Math.max(dp[i],max); 
        
        }
        // int height=cuboids[maxind][];
       
        return max;
    }
}