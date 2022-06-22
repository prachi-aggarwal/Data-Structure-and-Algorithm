class Solution {
    public int lowerbound(ArrayList<Integer> sorted,int num){
        int low=0;int high=sorted.size()-1;
        int idx=sorted.size();
        while(low<=high){
            int mid=low+(high-low)/2;
            if(sorted.get(mid)<num){
                low=mid+1;
            }
            else{
                high=mid-1;
                idx=mid;
            }
        }
        return idx;
    }
    public int lengthOfLIS(int[] nums) {
       int n=nums.length;
        ArrayList<Integer> sorted=new ArrayList<>();
        for(int i=0;i<n;i++){
            int lb=lowerbound(sorted,nums[i]);
            if(sorted.size()==lb){
                sorted.add(nums[i]);
            }
            else{
                sorted.set(lb,nums[i]);
            }
        }
        return sorted.size();
    }
    
}
