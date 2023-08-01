//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main(String[] args) throws IOException
	{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        while(t-->0)
        {
            StringTokenizer stt = new StringTokenizer(br.readLine());
            
            int n = Integer.parseInt(stt.nextToken());
            int m = Integer.parseInt(stt.nextToken());
            int k = Integer.parseInt(stt.nextToken());
            int a[] = new int[(int)(n)];
            int b[] = new int[(int)(m)];
            
            
            String inputLine[] = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) {
                a[i] = Integer.parseInt(inputLine[i]);
            }
            String inputLine1[] = br.readLine().trim().split(" ");
            for (int i = 0; i < m; i++) {
                b[i] = Integer.parseInt(inputLine1[i]);
            }
            
            
            Solution obj = new Solution();
            System.out.println(obj.kthElement( a, b, n, m, k));
            
        }
	}
}

// } Driver Code Ends


//User function Template for Java


class Solution {
    public long kthElement( int arr1[], int arr2[], int n, int m, int k) {
        
        int i=0,j=0;
        if(k>n+m){
            return -1;
        }
        int curr = 0;
        while(curr<k){
            
            if( i==n){
                return arr2[j+ k- curr -1];
            }
            
            if(j==m){
                return arr1[i+ k -curr -1];
            }
            
            if(curr==k-1){
                if(arr1[i]>arr2[j]){
                    return arr2[j];
                }else{
                    return arr1[i];
                }
            }
            
            if(arr1[i]<arr2[j]){
                i++;
            }else{
                j++;
            }
            
            
            curr++;
            
        }
        
        return 0;
    }
}