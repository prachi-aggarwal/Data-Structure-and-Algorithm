class Solution {
    public boolean isPalendromic(String s){
      int left=0;
        int right =s.length()-1;
        while(left<right){
            if(s.charAt(left)!=s.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
    public int countSubstrings(String s) {
        int freq=0;
        for(int i=0;i<s.length();i++){
            for(int j=i;j<s.length();j++){
                String st=s.substring(i,j+1);
                if(isPalendromic(st))freq++;
            }
        }
        return freq;
    }
}