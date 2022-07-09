class Solution {
    public String addStrings(String num1, String num2) {
        int i = num1.length()-1;
        int j = num2.length()-1;
        StringBuilder result = new StringBuilder();
        int carry=0;
        while(i>-1||j>-1){
            int d1=i>-1?num1.charAt(i)-'0':0;
            int d2=j>-1?num2.charAt(j)-'0':0;
            int sum=d1+d2+carry;
            result.append(sum%10);
            carry = sum/10;
            j--;i--;
        }
        while(carry>0){
        
            result.append(carry%10);
            carry=carry/10;
        }
        return result.reverse().toString();
    }
}