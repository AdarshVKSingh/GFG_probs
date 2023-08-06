//{ Driver Code Starts
//Initial Template for Java

/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;
class Main {
	public static void main (String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int T=sc.nextInt();
		sc.nextLine();
		while(T-->0)
		{
		    
		    Solution ob=new Solution();
		    
		    String S=sc.nextLine();
		    
		    ArrayList<String> arr = ob.permutation(S);
		    for(String s : arr){
		        System.out.print(s+" ");
		    }
		    System.out.println();
		}
		
	}
}

// } Driver Code Ends


//User function Template for Java


class Solution
{
    public ArrayList<String> permutation(String S)
    {
        //Your code here
        
        ArrayList<String> a1 =  p(S,"");
        Collections.sort(a1);
        return a1;
    }
    
    public ArrayList<String>p(String up,String p)
    {
        if(up.isEmpty()){
           ArrayList<String> al =  new ArrayList<>();
           al.add(p);
           return al;
        }
        
        char ch = up.charAt(0);
        ArrayList<String> a = new ArrayList<>();
        for(int i=0;i<=p.length();i++){
            String f = p.substring(0,i);
            String l = p.substring(i);
            
            a.addAll(p(up.substring(1),f+ch+l));
            
        }
        
        return a;
    }
	   
}
