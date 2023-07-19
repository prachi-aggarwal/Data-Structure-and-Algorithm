//{ Driver Code Starts
import java.util.Scanner;
import java.util.*;
import java.lang.*;
import java.io.*;
import java.util.LinkedList;

class GreyCode
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t>0)
		{
			int n = sc.nextInt();
			Solution g = new Solution();
			ArrayList <String> res = g.generateCode(n);
			for (String i : res) 
			    System.out.print (i + " ");
			System.out.println();
		t--;
		}
	}
}
// } Driver Code Ends


/*Returns an array of all n-bit gray codes sequence.
You are required to complete below method. */
class Solution
{
    ArrayList <String> generateCode(int n)
    {
        if(n==1){
          ArrayList<String> res=new ArrayList<>();  
          res.add("0");
          res.add("1");
          return res;
        }
        ArrayList<String> res=generateCode(--n);
        for(int idx=res.size()-1;idx>=0;idx--){
            res.add("1"+res.get(idx));
            res.set(idx,"0"+res.get(idx));
        }
        
	return res;
    }
}
