class Solution {
    public int maxProfit(int[] prices) {
        
    int n=prices.length;
        int [] left=new int[n];
        int [] right=new int[n];
        int buyingDay=prices[0];
        //aj ya ajse phle phle becha ho
        for(int i=1;i<n;i++){
            int currprofit=prices[i]-buyingDay;
            if(left[i-1]>currprofit){
                currprofit=left[i-1];
                
               
            }
             left[i]=currprofit;
                buyingDay=Math.min(buyingDay,prices[i]);
        }
        //aj ya aj ke bad khareeda ho
        int sellingDay=prices[n-1];
        for(int i=n-2;i>=0;i--){
            int currprofit=sellingDay-prices[i];
            if(right[i+1]>currprofit){
                currprofit=right[i+1];
                
               
            }
             right[i]=currprofit;
                sellingDay=Math.max(sellingDay,prices[i]);
        }
        //maximum profit of left[i] + right[i] for each day
        int maxprofit=0;
        for(int i=0;i<n;i++){
            int currprofit=left[i] +right[i];
            maxprofit=Math.max(maxprofit,currprofit);
            
        }
        return maxprofit;
        
        
    }
    
}
