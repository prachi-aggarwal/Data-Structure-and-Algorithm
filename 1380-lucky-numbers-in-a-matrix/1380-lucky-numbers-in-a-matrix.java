class Solution {
    public List<Integer> luckyNumbers (int[][] matrix) {
    List<Integer> arr=new ArrayList<>();
        for(int i=0;i<matrix.length;i++){
            int mincol=0;
            for(int j=0;j<matrix[0].length;j++){
                if(matrix[i][j]<matrix[i][mincol]){
                    mincol=j;
                }
            }
        
            int maxrow=0;
            for(int k=0;k<matrix.length;k++){
                
                    if(matrix[k][mincol]>matrix[maxrow][mincol]){
                        maxrow=k;
                    }
                    
                
                
            }
            if(maxrow==i) {
                        arr.add(matrix[maxrow][mincol]);
                        return arr;
                        }
        }
        
       
        
        return arr;
        
        
        
        
    }
}