//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;
import java.lang.*; 
class GfG
{
    public static void main (String[] args)
    {
        
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-- > 0)
        {
            long n = sc.nextLong();
    		System.out.println (new Solution().colName (n));
        }
        
    }
}

// Contributed By: Pranay Bansal 

// } Driver Code Ends


//User function Template for Java

class Solution
{
    String colName (long n)
    {
        // your code here
        StringBuilder s = new StringBuilder();
        while(n!=0){
            int a;
            if(n%26==0){
                a = 26;
                n = n-1;
            }else{
                a =   (int)((n-1) % 26 + 1);
            }
            
            char c ;
            // if(a==0){
            //     c = 'Z';
            // }else{
            //     c = (char)(65+ a -1);
            // }
            c = (char)(65+ a -1);
            s.insert(0,c);
            n = n/26;
            
            
        }
        
        return s.toString();
    }
}