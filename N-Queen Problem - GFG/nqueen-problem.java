//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;
import java.lang.*;

class GFG{
    public static void main(String args[])throws IOException
    {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(in.readLine());
        while(t-- > 0) {
            int n = Integer.parseInt(in.readLine());
            
            Solution ob = new Solution();
            ArrayList<ArrayList<Integer>> ans = ob.nQueen(n);
            if(ans.size() == 0)
                System.out.println("-1");
            else {
                for(int i = 0;i < ans.size();i++){
                    System.out.print("[");
                    for(int j = 0;j < ans.get(i).size();j++)
                        System.out.print(ans.get(i).get(j) + " ");
                    System.out.print("] ");
                }
                System.out.println();
            }
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution{
    static ArrayList<ArrayList<Integer>> nQueen(int n) {
       int check[][] = new int[n][n];
       for(int i=0;i<n;i++){
           for(int j=0;j<n;j++){
               check[i][j] = 0;
           }
       }
       
       ArrayList<String> arr = new ArrayList<>();
       arr = nQueen1(check,0,n,"");
       ArrayList<ArrayList<Integer>> arr1 = new ArrayList<ArrayList<Integer>>();
       
       for(String s : arr){
         
           ArrayList<Integer> arr2 = new ArrayList<>();
           String [] s1 = s.split(" ");
           
           for(String m: s1){
               if(!m.equals(" ")){
                   arr2.add(Integer.valueOf(m));
               }
           }
          
          
           arr1.add(arr2);
       }
       
       return arr1;
       
    }
    
    static ArrayList<String> nQueen1(int [][]check ,int r,int n,String p){
        if(r==n){
            
            ArrayList<String> arr = new ArrayList<>();
            arr.add(p);
            //System.out.print(p);
            return arr;
        }
        
        ArrayList<String> arr = new ArrayList<>();
        
        
        for(int c=0;c<n;c++){
            
            if(isSafe(check,r,c,n)){
                
                check[r][c] = 1;
                arr.addAll(nQueen1(check,r+1,n,p+Integer.toString(c+1)+" "));
                check[r][c] = 0;
                
            }
            
           
        }
        return arr;
    }
    
    static boolean isSafe(int [][]check,int r,int c,int n){
        for(int i=0;i<r;i++){
            if(check[i][c]==1){
                return false;
            }
        }
        
        int maxleft = Math.min(r,c);
        for(int i=1;i<=maxleft;i++){
            if(check[r-i][c-i]==1){
                return false;
            }
        }
        
        int maxright = Math.min(r,n-c-1);
        for(int i=1;i<=maxright;i++){
            if(check[r-i][c+i]==1){
                return false;
            }
        }
        
        return true;
        
        
    }
}