//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*; 

class GFG{
    public static void main(String args[]) throws IOException { 
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t > 0){
        	int n = sc.nextInt();
        	int[] array = new int[n];
        	for (int i=0; i<n ; i++ ) {
        		array[i] = sc.nextInt();
        	}
            Solution ob = new Solution();
            long[] ans = new long[n];
            ans = ob.productExceptSelf(array, n); 

           	for (int i = 0; i < n; i++) { 
				System.out.print(ans[i]+" ");
			} 
            System.out.println();
            t--;
        }
    } 
} 
  


// } Driver Code Ends


//User function Template for Java


class Solution 
{ 
	public static long[] productExceptSelf(int nums[], int n) 
	{ 
        long product = 1;
        int zero = 0;
        long arr[] = new long[n];
        for(int i=0;i<n;i++){
            if(nums[i]==0){
                zero+=1;
            }else{
                product  *= nums[i];
            }
            
        }
        
        
        for(int i=0;i<n;i++){
            if(zero>1){
                arr[i] = 0;
            }else if(zero==1){
                if(nums[i]==0){
                    arr[i] = product;
                }else{
                    arr[i] = 0;
                }
            }else{
                arr[i] = (long)(product/nums[i]);
            }
        }
        return arr;
        
	} 
} 
