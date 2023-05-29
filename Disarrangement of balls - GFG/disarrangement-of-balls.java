//{ Driver Code Starts
//Initial Template for Java
import java.io.*;
import java.util.*;

class GFG{
    public static void main(String args[])throws IOException
    {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while(t-- > 0){
            int N = Integer.parseInt(read.readLine());
            
            Solution ob = new Solution();
            System.out.println(ob.disarrange(N));
        }
    }
}

// } Driver Code Ends


//User function Template for Java

class Solution{
    static long disarrange(int N){
        
        long dp[] = new long[N+1];
        Arrays.fill(dp,-1);
        return solve(N,dp);
    }
    
    static long solve(int n,long[] dp){
        if(n==0|| n==1){
            return 0;
        }
        if(n==2){
            return 1;
        }
        
        if(dp[n]!=-1){
            return dp[n];
        }
        
        dp[n] =  ((n-1)*( (solve(n-1,dp) + solve(n-2,dp))%(1000000007)))%(1000000007);
        return dp[n];
    }
}