//{ Driver Code Starts
/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;

class Driverclass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            int k = sc.nextInt();

            System.out.println(new Solution().countOccurence(arr, n, k));
        }
    }
}

// } Driver Code Ends


class Solution 
{
    //Function to find all elements in array that appear more than n/k times.
    public int countOccurence(int[] arr, int n, int k) 
    {
        int num = n/k;
        HashMap<Integer,Integer> hs = new HashMap<Integer,Integer>();
        
        for(int i=0;i<n;i++){
            if(hs.containsKey(arr[i])){
                hs.replace(arr[i],hs.get(arr[i])+1);
            }else{
                hs.put(arr[i],1);
            }
        }
        
        int count = 0;
        for(Map.Entry<Integer,Integer> h : hs.entrySet()){
            int a = h.getValue();
            if(a>num){
                count++;
            }    
        }
        return count;
    }
}
