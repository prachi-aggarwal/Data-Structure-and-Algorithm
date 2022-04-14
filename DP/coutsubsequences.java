import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {

     Scanner sc=new Scanner(System.in);
     String str=sc.nextLine();
int n=str.length();
    int [][]dp=new int[3][n+1];
    int x=0;
    int y=0;
    int z=0;
    for(int i=1;i<=n;i++){
        char ch=str.charAt(i-1);
        
        if(ch=='a'){
        x=2*x+1;    
        }
        else if(ch=='b'){
           y=2*y+x;
        }
        else if(ch=='c'){
            z=2*z+y;
        }
    }
System.out.println(z);
    }
}
