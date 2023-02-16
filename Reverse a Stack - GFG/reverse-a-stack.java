//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.io.*;
import java.lang.*;

class GFG
{
    public static void main(String args[])throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
        PrintWriter out=new PrintWriter(System.out);
        
        //taking testcases
        int t = Integer.parseInt(br.readLine()); 
    	for(int i=0;i<t;i++)
    	{
            String str=br.readLine();
    		
    		//input n and d
    	    int n=Integer.parseInt(str);
    		Stack<Integer> stack=new Stack<>();
    		String str1=br.readLine();
    		String[] starr1=str1.split(" ");
    		//inserting elements in the array
    		for(int j=0;j<n;j++)
    		{
    		    stack.push(Integer.parseInt(starr1[j]));
    		}
    		//calling reverse() function
            Solution.reverse(stack);
            for(int j:stack){
                out.print(j+" ");
            }
            out.println();
         }
         out.close();
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution
{ 
    static void reverse(Stack<Integer> s)
    {
        ArrayList<Integer> arr1 = reverseStack(s);
        while(!s.isEmpty()){
            s.pop();
        }
        for(int a: arr1){
            s.push(a);
        }
      
    }
    
    static ArrayList<Integer> reverseStack(Stack<Integer> s){
        ArrayList<Integer> arr = new ArrayList<>();
        if(s.isEmpty()){
           ArrayList<Integer> arr2 = new ArrayList<>(); 
            return arr2;
        }
        
        arr.add(s.pop());
        arr.addAll(reverseStack(s));
        
        return arr;
    }
}