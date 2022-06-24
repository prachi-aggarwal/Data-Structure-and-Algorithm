class Solution {
    public int binarysearch(ArrayList<Integer> sorted,int target){
        int low=0;
        int high=sorted.size()-1;
        int idx=sorted.size();
        while(low<=high){
            int mid=low+(high-low)/2;
            if(sorted.get(mid)<target){
                low=mid+1;
            }
            else{
                idx=mid;
                high=mid-1;
            }
        }
        return idx;
    }
    public int maxEnvelopes(int[][] envelopes) {
     
        Arrays.sort(envelopes,(int [] first,int [] second)->{
            return (first[0]!=second[0])?first[0]-second[0]:second[1]-first[1];
        });
        ArrayList<Integer> sorted=new ArrayList<Integer>();
        for(int i=0;i<envelopes.length;i++){
            // for(int j=0;j<ij++){
               int lb= binarysearch(sorted,envelopes[i][1]);
                if(lb==sorted.size()){
                    sorted.add(envelopes[i][1]);
                }
                else{
                    sorted.set(lb,envelopes[i][1]);
                }
                    
                
            // return sorted.size();
        }
        
        
        return sorted.size();
        
        
        
        
        
    }
}