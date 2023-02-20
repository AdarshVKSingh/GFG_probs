//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*; 

class GFG{
    public static void main(String args[]) throws IOException { 
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t>0)
        {
            int N = sc.nextInt();
            int M[][] = new int[N][N];
            for(int i=0; i<N; i++)
            {
                for(int j=0; j<N; j++)
                {
                    M[i][j] = sc.nextInt();
                }
            }
            System.out.println(new Solution().celebrity(M,N));
            t--;
        }
    } 
} 
// } Driver Code Ends


//User function Template for Java


class Solution
{ 
    //Function to find if there is a celebrity in the party or not.
    int celebrity(int M[][], int n)
    {
    	for(int i=0;i<n;i++){
    	    int isCeleb = 1;
    	    for(int j=0;j<n;j++){
    	       if(M[i][j]==1){
    	            isCeleb = 0;   
    	       } 
    	        
    	    }
    	    int a = 1;
    	    if(isCeleb==1){
    	        
    	        for(int k=0;k<n;k++){
    	            if(M[k][i]==0 && k!=i)
    	            {
    	                a=0;
    	            }
    	        }
    	    }
    	    if(a==1 && isCeleb==1){
    	        return i;
    	    }
    	    
    	}
    	
    	return -1;
    }
}