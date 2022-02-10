class Solution
{ 
    //Function to find if there is a celebrity in the party or not.
    int celebrity(int M[][], int n)
    {
    Stack<Integer> stk=new Stack<>();
    for(int i=0;i<M.length;i++){
        stk.push(i);
        while(stk.size()>1){
            int x=stk.pop();
            int y=stk.pop();
            if(M[x][y]==1){
                stk.push(y);
            }
            else{
                stk.push(x);
            }
        }
        
    }
    int val=stk.pop();
    int res=0;
    for(int i=0;i<M.length;i++){
        if(i==val)continue;
        if(M[val][i]==1){
           return -1;
        }
        
    }
       for(int i=0;i<M.length;i++){
           if(val==i)continue;
        if(M[i][val]==0){
           
            return -1;
        }
    }
    return val;
    }
}
