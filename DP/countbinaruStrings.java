import java.io.*;
import java.util.*;

public class Main{

public static void main(String[] args) throws Exception {
   Scanner sc =new Scanner(System.in);
   int n=sc.nextInt();
   int []endwith0=new int[n+1];
   int []endwith1=new int[n+1];
   endwith0[1]=1;
   endwith1[1]=1;      
   for(int i=2;i<endwith0.length;i++){
       endwith0[i]=endwith1[i-1];
       endwith1[i]=endwith0[i-1]+endwith1[i-1];
   }
   System.out.println( endwith0[n]+endwith1[n]);
   
 }

}
//o(n)space and time 





import java.io.*;
import java.util.*;

public class Main{

public static void main(String[] args) throws Exception {
   Scanner sc =new Scanner(System.in);
   int n=sc.nextInt();
   ;
 int prev1=1;
 int prev0=0;
   for(int i=0;i<n;i++){
    int  curr0=prev1;
     int curr1=prev1+prev0;
     prev0=curr0;
     prev1=curr1;
   }
   System.out.println( prev0+prev1);
   
 }

}
//o(1) space
