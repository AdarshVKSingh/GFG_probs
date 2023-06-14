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
            String S[] = read.readLine().split(" ");
            
            int N = Integer.parseInt(S[0]);
            int K = Integer.parseInt(S[1]);
            
            int[] A = new int[N];
            
            String S1[] = read.readLine().split(" ");
            for(int i=0; i<N; i++)
                A[i] = Integer.parseInt(S1[i]);

            Solution ob = new Solution();
            System.out.println(ob.maxDiamonds(A,N,K));
        }
    }
}
// } Driver Code Ends


//User function Template for Java


class Solution {
    static long maxDiamonds(int[] A, int N, int K) {
        int time = K;
        long total = 0;
        PriorityQueue<Integer> pq
            = new PriorityQueue<Integer>(
                new Comparator<Integer>() {
                   
                    public int compare(Integer a, Integer b)
                    {
                        if (a < b)
                            return 1;
                        if (a > b)
                            return -1;
                        return 0;
                    }
                });
        for(int i:A){
            pq.add(i);
        }       
        while(pq.size()>0 && time>0 && pq.peek()>0){
            int ele = pq.remove();
            total += ele;
            pq.add((int)(ele/2));
            time--;
        }        
        return total;
        
    }    
};