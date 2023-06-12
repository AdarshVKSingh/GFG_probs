//{ Driver Code Starts
import java.io.*;
import java.util.*;

class RodCutting {

    public static void main(String args[])throws IOException {
        BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out=new PrintWriter(System.out);
        
        int t = Integer.parseInt(in.readLine().trim());
        while (t-- > 0) {
            int n = Integer.parseInt(in.readLine().trim());
            String s[]=in.readLine().trim().split(" ");
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) arr[i] = Integer.parseInt(s[i]);

            Solution ob = new Solution();
            out.println(ob.cutRod(arr, n));
        }
        out.close();
    }
}

// } Driver Code Ends


class Solution{
    public int cutRod(int price[], int n) {
        //code here
        
        int dp[] = new int[n+1];
        for(int i=0;i<n+1;i++){
           
                dp[i] = -1;
            
        }
        
        return solve(price,n,dp);
    }
    
    int solve(int price[],int n,int []dp){
        if(n<=0){
            return 0;
        }
        
       
        
        if(dp[n]!=-1){
            return dp[n];
        }
        
        int max = 0;
        for(int i=1;i<=n;i++){
            if(n-i>=0){
                 int res = price[i-1] + solve(price,n-i,dp);
                max = Math.max(max,res);
            }
           
            
        }
        
        return dp[n] = max;
        
    }
}