//{ Driver Code Starts
import java.util.*;
import java.io.*;

class GFG
 {
	public static void main (String[] args)
	 {
	  
	  //taking input using Scanner class
	  Scanner sc = new Scanner(System.in);
	  
	  //taking count of testcases
	  int t = sc.nextInt();
	  while(t-- > 0){
	      
	      //taking count of houses
	      int n = sc.nextInt();
	      int arr[] = new int[n];
	      
	      //inserting money present in 
	      //each house in the array
	      for(int i = 0; i<n; ++i)
	           arr[i] = sc.nextInt();
  	      
  	      //calling method FindMaxSum() of class solve
  	      System.out.println(new Solution().FindMaxSum(arr, n));
	 }
   }
}
// } Driver Code Ends


class Solution
{
    //Function to find the maximum money the thief can get.
    public int FindMaxSum(int arr[], int n)
    {
        int dp[] = new int[n];
        Arrays.fill(dp,-1);
        return maxsum(arr,n-1,dp);
    }
    
    static int maxsum(int arr[],int n,int[] dp){
        if( n <0){
            return 0;
        }
        
        if(n==0){
            return arr[0];
        }
        
        if(dp[n]!=-1){
            return dp[n];
        }
        
            int out1 =  maxsum(arr,n-2,dp) + arr[n];
           int out2  = maxsum(arr,n-1,dp);
           
           dp[n] = Math.max(out1,out2);
           return dp[n];
            
        
      
    }
}