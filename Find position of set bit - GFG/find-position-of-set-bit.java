//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            int N = Integer.parseInt(read.readLine());

            Solution ob = new Solution();
            System.out.println(ob.findPosition(N));
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution {
    static int findPosition(int N) {
        // code here
        
        int found = 0;

        int count = 1;
        int index = 1;
        while(N!=0){
            if((N & 1)==1){
                found++ ;
                index = count;
            }
            N = N>>1;
            count++;
        }
        
        if(found==1){
            return index;
        }
        
        return -1;
    }
    
    // int count=0;
    //     int ans=0;
    //     while(N>0)
    //     {
    //         if((N & 1)==1)
    //           count++;
    //         N=N>>1;
    //         ans+=1;
    //     }
    //     if(count==1)return ans;
    //     else
    //       return -1;
    // }
};