import java.io.*;
import java.util.*;

public class Main{

public static void main(String[] args) throws Exception {

   Scanner sc =new Scanner(System.in);
   int n=sc.nextInt();
   
 long prev1=1l;
 long prev0=0l;
   for(int i=0;i<n;i++){
    long  curr0=prev1;
     long curr1=prev1+prev0;
     prev0=curr0;
     prev1=curr1;
   }
   System.out.println( (prev0+prev1)*(prev0+prev1));
   

 }

}
