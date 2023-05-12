//{ Driver Code Starts
import java.util.*;
import java.io.*;
import java.lang.*;

class gfg
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-- > 0)
        {
            int n = sc.nextInt();
            int m = sc.nextInt();
            
            int mat[][] = new int[n][m];
            for(int i = 0; i < n; i++)
            {
                for(int j = 0; j < m; j++)
                  mat[i][j] = sc.nextInt();
            }
            
            int x = sc.nextInt();
            
            System.out.println (new Sol().matSearch(mat, n, m, x));
        }
        
    }
}
// } Driver Code Ends


class Sol
{
    public static int matSearch(int mat[][], int N, int M, int X)
    {
        if(mat[N-1][M-1]<X || mat[0][0]>X){
            return 0;
        }
        
        int i = 0,j= M-1;
        
        while(i<N){
            if(mat[i][j]>X){
                j--;
            }else if(mat[i][j]<X){
                i++;
            }else{
                return 1;
            }
            
            if(j==-1 || i==N){
               
                return 0;
                
            }
        }
        
        return 0;
    }
}