//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG
{
    public static void main(String args[])throws IOException
    {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(in.readLine());
        while(t-- > 0){
            int N = Integer.parseInt(in.readLine());
            String input_line[] = in.readLine().trim().split("\\s+");
            int Matrix[][] = new int[N][N];
            for(int i = 0; i < N*N; i++)
                Matrix[(i/N)][i%N] = Integer.parseInt(input_line[i]);
            
            Solution ob = new Solution();
            System.out.println(ob.maximumPath(N, Matrix));
        }
    }
}

// } Driver Code Ends


//User function Template for Java

class Solution{
    static int maximumPath(int N, int Matrix[][])
    {
        // code here
        
        int max = Integer.MIN_VALUE;
        int dp[][] = new int[N][Matrix[0].length];
        for(int i=0;i<N;i++){
            for(int j = 0;j<Matrix[0].length;j++){
                dp[i][j] = -1;
            }
        }
        
        for(int i=0;i<Matrix[0].length;i++){
            max =Math.max(max,sum(0,i,N,Matrix,dp));
        }
        
        return max;
    }
    
    
    static boolean isSafe(int x,int y,int[][] mat){
        if(x>=0 && y>=0 && x<=mat.length && y<mat[0].length){
            return true;
        }
        return false;
    }
    static int sum(int x,int y,int N,int mat[][],int [][]dp){
        if(x==mat.length){
            return 0;
        }
        
        int max= Integer.MIN_VALUE;
        if(dp[x][y]!=-1){
            return dp[x][y];
        }
        for(int i=-1;i<2;i++){
            if(isSafe(x+1,y+i,mat)){
                
                max = Math.max(max,mat[x][y]+sum(x+1,y+i,N,mat,dp));
            }
        }
        dp[x][y] = max;
        return max;
    }
}