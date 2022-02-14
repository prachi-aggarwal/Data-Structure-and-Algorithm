class Solution {
    public int decimalToBinary(int num){
        int i=0;
        int res=0;
        while(num!=0){
            int rem=num%2;
            num=num/2;
            res=res+rem*(int)Math.pow(10,i);
            i++;
        }
        System.out.println(res);
        return res;
        
    }
    
    
    
    
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> array=new ArrayList<>();
        int n=(int)Math.pow(2,nums.length);
   
        for(int i=0;i<n;i++){
            ArrayList<Integer> res=new ArrayList<>();
            int bit= decimalToBinary(i); 
             int k=nums.length-1;
               for(int m=0;m<nums.length;m++){
            
            
           
            int j=(bit/(int)Math.pow(10,k))%10;
                   if(j==1)
           res.add(nums[m]);
                   
                   k--;
               
        }
            array.add(res);
    }
        
     return array;  
    } 
}