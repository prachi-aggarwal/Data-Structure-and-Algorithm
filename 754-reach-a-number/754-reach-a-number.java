class Solution {
    public int reachNumber(int target) {
        int sum=0;
        int jump=0;
        int i=1;
        target=Math.abs(target);
        while(sum<target){
            sum+=i;
            jump++;
            i++;
            }
        
    int k=target-sum;
        if(k%2==0)return jump;
        // if(k%2!=0){
        //     sum+=i;
        //     i++;
        //     jump++;
        //        int k=target-sum;
        // if(k%2==0)return jump;
        // }
        while(k%2!=0){
            sum+=i;
            i++;
            jump++;
              k=target-sum;
        if(k%2==0)return jump;
        }
        return jump;
    }
}