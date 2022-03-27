import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {

          Scanner sc=new Scanner(System.in);
          int n=sc.nextInt();
          int [] arr=new int[n];
          for(int i=0;i<n;i++){
              arr[i]=sc.nextInt();
          }
          int target=sc.nextInt();
          System.out.println(targetSum(arr,0,0,target));





    }
    public static boolean targetSum(int[] arr,int idx,int curr_sum,int target){
        if(idx>arr.length-1){
         if(curr_sum==target)return true;
         else return false;
        }
  
  if(curr_sum>target)return false;
        boolean yes = targetSum(arr,idx+1,curr_sum+arr[idx],target);
        boolean no=targetSum(arr,idx+1,curr_sum,target);
        if(yes==true||no==true)return true;
        return false;
        
  
  
     
     
        
    }
}
//memoizaation
public class Main {

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++)
            arr[i] = scn.nextInt();
        
        int target = scn.nextInt();
        
        int[][] dp = new int[n + 1][target + 1];
        
        for(int i=0; i<=n; i++){
            Arrays.fill(dp[i], -1);
        }
        System.out.println(targetSum(arr, 0, 0, target, dp));
    }
    
    public static boolean targetSum(int[] arr, int idx, int sum, int target, int[][] dp)
    {
        if(idx == arr.length)
        {
            if(target == sum) return true;
            return false;
        }
        
        if(sum > target) return false;
        if(dp[idx][sum] != -1) {
            return (dp[idx][sum] == 1) ? true : false;
        }
        
        // yes
        boolean yes = targetSum(arr, idx + 1, sum + arr[idx], target, dp);
        
        // no
        boolean no = targetSum(arr, idx + 1, sum, target, dp);
        
        
        if(yes == true || no == true){
            dp[idx][sum] = 1;
            return true;
        }else{
            dp[idx][sum] = 0;
            return false;
        }
    }
}




//tabulation
import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {

          Scanner sc=new Scanner(System.in);
          int n=sc.nextInt();
          int [] arr=new int[n];
          for(int i=0;i<n;i++){
              arr[i]=sc.nextInt();
          }
          int target=sc.nextInt();
          boolean dp[][] = new boolean[n+1][target+1];
          
           for(int i=0;i<=n;i++){
               dp[i][0]=true;
           }

for(int i=1;i<=n;i++){
    for(int j=1;j<=target;j++){
        
        boolean yes=(j-arr[i-1]>=0)?dp[i-1][j-arr[i-1]]:false;
        
        boolean no=dp[i-1][j];
        dp[i][j]=yes||no;
        
    }
}
    System.out.println( dp[n][target]);
}



    
   
     
     
        
    
}
