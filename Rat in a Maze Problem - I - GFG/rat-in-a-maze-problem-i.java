//{ Driver Code Starts
// Initial Template for Java

import java.util.*;
class Rat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int[][] a = new int[n][n];
            for (int i = 0; i < n; i++)
                for (int j = 0; j < n; j++) a[i][j] = sc.nextInt();

            Solution obj = new Solution();
            ArrayList<String> res = obj.findPath(a, n);
            Collections.sort(res);
            if (res.size() > 0) {
                for (int i = 0; i < res.size(); i++)
                    System.out.print(res.get(i) + " ");
                System.out.println();
            } else {
                System.out.println(-1);
            }
        }
    }
}

// } Driver Code Ends


// User function Template for Java

// m is the given matrix and n is the order of matrix
class Solution {
    public static ArrayList<String> findPath(int[][] m, int n) {
        int check[][] = new int[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                check[i][j] = 0;
            }
        }
        
        return allPath("",m,check,0,0,n);
        
    }
    public static ArrayList<String> allPath(String p,int [][]m,int[][]check,int r,int c,int n){
        if(r==n-1 && c==n-1){
            
            ArrayList<String> arr = new ArrayList<>();
            if(m[n-1][n-1]==0){
                return arr;
            }
            arr.add(p);
            return arr;
        }
      
        ArrayList<String> arr = new ArrayList<>();
        if(m[r][c] == 0 || check[r][c]==1){
            return arr;
        }
        check[r][c]=1;
        
        if(c<n-1){
            arr.addAll(allPath(p+'R',m,check,r,c+1,n));
        }
        if(r<n-1){
            arr.addAll(allPath(p+'D',m,check,r+1,c,n));
        }
        if(c>0){
            arr.addAll(allPath(p+'L',m,check,r,c-1,n));
        }
        if(r>0){
            arr.addAll(allPath(p+'U',m,check,r-1,c,n));
        }
        
        check[r][c] = 0;
        
        return arr;
        
    }
    
}