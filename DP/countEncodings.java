//memoization
import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
Scanner sc=new Scanner(System.in);
String str=sc.nextLine();
int []dp=new int[str.length()];
Arrays.fill(dp,-1);

System.out.println(countEncodings(str,dp,0));
    }
    public static int countEncodings(String str,int [] dp,int idx){
        if(str.length()==idx){
            return 1;
        }
        
        if(dp[idx]!=-1){
            return dp[idx];
        }
        int ans=0;
        int ch1=str.charAt(idx)-'0';
        if(ch1>=1&&ch1<10){
            ans+=countEncodings(str,dp,idx+1);
        }
        if(idx+1<str.length()){
        int ch2=(str.charAt(idx)-'0')*10+(str.charAt(idx+1)-'0');
        if(ch2<=26&&ch2>=10){
             ans+=countEncodings(str,dp,idx+2);
        }
        }
        dp[idx]=ans;
        return dp[idx];
    }
}




//tabulation
   public static int countEncodings(String str){
        int[] dp=new int[str.length()+1];
        dp[str.length()]=1;
        
        for(int i=str.length()-1;i>=0;i--){
          int ch1=str.charAt(i)-'0';
        if(ch1>=1&&ch1<10){
            dp[i]+=dp[i+1];
        } 
         if(i+1<str.length()){
        int ch2=(str.charAt(i)-'0')*10+(str.charAt(i+1)-'0');
        if(ch2<=26&&ch2>=10){
             dp[i]+=dp[i+2];
        }
        }
        }
      
        return dp[0];
    }
}
