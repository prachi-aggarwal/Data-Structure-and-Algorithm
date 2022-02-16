class Solution {
    public String convertToTitle(int columnNumber) {
    
        StringBuilder str=new StringBuilder ();
        while(columnNumber!=0){
            char c=(char)('A'+(columnNumber-1)%26);
            str.append(c);
            columnNumber=(columnNumber-1)/26;
        }
        
        return str.reverse().toString();
        
        
    }
}