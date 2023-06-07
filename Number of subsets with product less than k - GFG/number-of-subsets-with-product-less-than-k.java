//{ Driver Code Starts
import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            int N = Integer.parseInt(read.readLine());
            
            String S[] = read.readLine().split(" ");
            int[] arr = new int[N];
            
            int K = Integer.parseInt(read.readLine());
            
            for(int i=0; i<N; i++)
                arr[i] = Integer.parseInt(S[i]);

            Solution ob = new Solution();
            System.out.println(ob.numOfSubsets(arr,N,K));
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution {
    static int numOfSubsets(int[] arr, int N, int K) {
        // code here
        return solve(arr,N,K,1);
    }
    
    static int solve(int[] arr,int N,int K,int prod){
        if(N==0 && prod<=K){
            return 0;
        }
        if(N==0 || prod> K){
            return -1;
        }
       
        
        int sel = 1 + solve(arr,N-1,K,prod*arr[N-1]);
        int notsel =  solve(arr,N-1,K,prod);
        
        // if(sel==-1 && notsel!=-1){
        //     return notsel;
        // }
        //  if(sel!=-1 && notsel==-1){
        //     return sel;
        // }
        
        // if(sel==-1 && notsel==-1){
        //     return 0;
        // }
        
        return sel + notsel;
    }
};