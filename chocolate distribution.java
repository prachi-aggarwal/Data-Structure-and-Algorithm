class Solution
{
    public long findMinDiff (ArrayList<Long> a, long n, long m)
    {
    Collections.sort(a);
    
    long min=Long.MAX_VALUE;
    for(int i=0;i<=(int)n-m;i++){
        long range=a.get(i+(int)m-1)-a.get(i);
        if(range<min)min=range;
    }
    
    return min;
    
    
    }
}
